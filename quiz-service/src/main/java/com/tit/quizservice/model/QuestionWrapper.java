package com.tit.quizservice.model;

public class QuestionWrapper {

    private Integer id;
    private String question_title;
    private String option_1;
    private String option_2;
    private String option_3;
    private String option_4;

    // No-argument constructor
    public QuestionWrapper() {
    }

    // Parameterized constructor
    public QuestionWrapper(Integer id, String question_title, String option_1, String option_2, String option_3, String option_4) {
        this.id = id;
        this.question_title = question_title;
        this.option_1 = option_1;
        this.option_2 = option_2;
        this.option_3 = option_3;
        this.option_4 = option_4;
    }

    // Getter and Setter for id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Getter and Setter for question_title
    public String getQuestion_title() {
        return question_title;
    }

    public void setQuestion_title(String question_title) {
        this.question_title = question_title;
    }

    // Getter and Setter for option_1
    public String getOption_1() {
        return option_1;
    }

    public void setOption_1(String option_1) {
        this.option_1 = option_1;
    }

    // Getter and Setter for option_2
    public String getOption_2() {
        return option_2;
    }

    public void setOption_2(String option_2) {
        this.option_2 = option_2;
    }

    // Getter and Setter for option_3
    public String getOption_3() {
        return option_3;
    }

    public void setOption_3(String option_3) {
        this.option_3 = option_3;
    }

    // Getter and Setter for option_4
    public String getOption_4() {
        return option_4;
    }

    public void setOption_4(String option_4) {
        this.option_4 = option_4;
    }
}
