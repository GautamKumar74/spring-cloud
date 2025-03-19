package com.tit.questionservice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String category;
    private String difficultylevel;
    private String option_1;
    private String option_2;
    private String option_3;
    private String option_4;
    private String question_title;
    private String right_answer;

    // No-argument constructor
    public Question() {
    }

    // All-arguments constructor
    public Question(Integer id, String category, String difficultylevel, String option_1, String option_2,
                    String option_3, String option_4, String question_title, String right_answer) {
        this.id = id;
        this.category = category;
        this.difficultylevel = difficultylevel;
        this.option_1 = option_1;
        this.option_2 = option_2;
        this.option_3 = option_3;
        this.option_4 = option_4;
        this.question_title = question_title;
        this.right_answer = right_answer;
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getDifficultylevel() {
        return difficultylevel;
    }

    public String getOption_1() {
        return option_1;
    }

    public String getOption_2() {
        return option_2;
    }

    public String getOption_3() {
        return option_3;
    }

    public String getOption_4() {
        return option_4;
    }

    public String getQuestion_title() {
        return question_title;
    }

    public String getRight_answer() {
        return right_answer;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDifficultylevel(String difficultylevel) {
        this.difficultylevel = difficultylevel;
    }

    public void setOption_1(String option_1) {
        this.option_1 = option_1;
    }

    public void setOption_2(String option_2) {
        this.option_2 = option_2;
    }

    public void setOption_3(String option_3) {
        this.option_3 = option_3;
    }

    public void setOption_4(String option_4) {
        this.option_4 = option_4;
    }

    public void setQuestion_title(String question_title) {
        this.question_title = question_title;
    }

    public void setRight_answer(String right_answer) {
        this.right_answer = right_answer;
    }
}
