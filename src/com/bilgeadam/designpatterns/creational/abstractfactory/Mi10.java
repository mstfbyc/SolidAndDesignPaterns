package com.bilgeadam.designpatterns.creational.abstractfactory;

public class Mi10 implements Phone {
    private String model;
    private String batary;
    private int width;
    private int height;

    public Mi10() {
    }

    public Mi10(String model, String batary, int width, int height) {
        this.model = model;
        this.batary = batary;
        this.width = width;
        this.height = height;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBatary() {
        return batary;
    }

    public void setBatary(String batary) {
        this.batary = batary;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
