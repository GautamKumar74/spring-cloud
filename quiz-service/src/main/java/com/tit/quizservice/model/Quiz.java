package com.tit.quizservice.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;

    @ElementCollection
    private List<Integer> questionIds;

    // Default Constructor
    public Quiz() {
    }

    // Parameterized Constructor
    public Quiz(Integer id, String title, List<Integer> questionIds) {
        this.id = id;
        this.title = title;
        this.questionIds = questionIds;
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<Integer> getQuestionIds() {
        return questionIds;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuestionIds(List<Integer> questionIds) {
        this.questionIds = questionIds;
    }

    // toString() Method
    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", questionIds=" + questionIds +
                '}';
    }
}
