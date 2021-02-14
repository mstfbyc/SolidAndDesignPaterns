package com.bilgeadam.designpatterns.behavioral.iterator;

import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Book book = new Book("Matematik");
        Fascicle fascicle = new Fascicle("Türkçe");

        Question[] questions = fascicle.getQuestions();
        List<Question> questionList = book.getQuestionList();

/*
        for (Question question:questionList) {
            Long questionId = question.getQuestionId();
            System.out.println("Soru no: " + questionId);

        }
        for (Question question:questions) {
            Long questionId = question.getQuestionId();
            System.out.println("Soru no: " + questionId);
        }
*/
        Iterator questionIteratorBook = book.getQuestionIterator();
        Iterator questionFascicle = fascicle.getQuestionIterator();
        print(questionIteratorBook);
        print(questionFascicle);


    }
    private static void print(Iterator questionIterator){
        while (questionIterator.hasNext()){
            Question question = (Question) questionIterator.next();
            Long questionId = question.getQuestionId();
            System.out.println("Soru no: " + questionId);
        }
    }
}
