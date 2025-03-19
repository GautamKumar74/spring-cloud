package com.tit.quizservice.model;

public class QuizDto {
    String categoryName;
    Integer numQuestions;
    String title;

    // No-argument constructor
    public QuizDto() {
    }

    // Parameterized constructor
    public QuizDto(String categoryName, Integer numQuestions, String title) {
        this.categoryName = categoryName;
        this.numQuestions = numQuestions;
        this.title = title;
    }

    // Getters and Setters
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(Integer numQuestions) {
        this.numQuestions = numQuestions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
