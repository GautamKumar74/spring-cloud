package com.tit.quizservice.model;

public class Response {
    private Integer id;
    private String response;

    // No-argument constructor
    public Response() {
    }

    // Parameterized constructor
    public Response(Integer id, String response) {
        this.id = id;
        this.response = response;
    }

    // Getter and Setter for id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Getter and Setter for response
    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
