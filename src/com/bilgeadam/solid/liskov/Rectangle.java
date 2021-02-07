package com.bilgeadam.solid.liskov;

public class Rectangle implements Shape {
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    private int width;
    private int height;

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
    public int area(){
        return height*width;
    }

    @Override
    public int getArea() {
        return height*width;
    }
}
