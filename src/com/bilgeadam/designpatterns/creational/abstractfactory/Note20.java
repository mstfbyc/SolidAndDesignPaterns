package com.bilgeadam.designpatterns.creational.abstractfactory;

public class Note20 implements Phone {
    private String model;
    private String batary;
    private int width;
    private int height;

    public Note20() {
    }

    public Note20(String model, String batary, int width, int height) {
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

    @Override
    public String toString() {
        return "Note20{" +
                "model='" + model + '\'' +
                ", batary='" + batary + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
