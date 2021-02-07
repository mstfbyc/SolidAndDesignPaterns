package com.bilgeadam.designpatterns.structural.decorator;

public class BaseReport implements IReport{
    private String text;

    public BaseReport(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
