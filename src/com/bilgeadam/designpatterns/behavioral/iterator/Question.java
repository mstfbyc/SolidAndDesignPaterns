package com.bilgeadam.designpatterns.behavioral.iterator;

public class Question {
    private Long questionId;

    public Question(Long questionId) {
        this.questionId = questionId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }
}
