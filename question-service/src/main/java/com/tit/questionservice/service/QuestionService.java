package com.tit.questionservice.service;

import com.tit.questionservice.model.Question;
import com.tit.questionservice.dao.QuestionDao;
import com.tit.questionservice.model.QuestionWrapper;
import com.tit.questionservice.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public ResponseEntity<List<Question>> getAllQuestions() {
        return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
        return new ResponseEntity<>(questionDao.findByCategory(category), HttpStatus.OK);
    }

    public ResponseEntity<String> addQuestion(Question question) {
        questionDao.save(question);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<Integer>> getQuestionsForQuiz(String categoryName, Integer numQuestions) {
        List<Integer> questions= questionDao.findRandomQuestionsByCategory(categoryName, numQuestions);
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Integer> questionIds) {
        List<QuestionWrapper> wrappers= new ArrayList<>();
        List<Question> questions= new ArrayList<>();

        for(Integer id : questionIds){
            questions.add(questionDao.findById(id).get());
        }

        for(Question question : questions){
            QuestionWrapper wrapper = new QuestionWrapper();
            wrapper.setId(question.getId());
            wrapper.setQuestion_title(question.getQuestion_title());
            wrapper.setOption_1(question.getOption_1());
            wrapper.setOption_2(question.getOption_2());
            wrapper.setOption_3(question.getOption_3());
            wrapper.setOption_4(question.getOption_4());
            wrappers.add(wrapper);
        }

        return new ResponseEntity<>(wrappers,HttpStatus.OK);
    }

    public ResponseEntity<Integer> getScore(List<Response> responses) {
        int right= 0;
        for (Response response : responses){
            Question question= questionDao.findById(response.getId()).get();
            if(response.getResponse().equals(question.getRight_answer()))
                right++;
        }
        return new ResponseEntity<>(right, HttpStatus.OK);
    }
}
