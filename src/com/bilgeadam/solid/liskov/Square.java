package com.bilgeadam.solid.liskov;

public class Square implements Shape{
    private int size;

    public Square(int size) {
        this.size = size;
    }

    public Square() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getArea() {
        return size*size;
    }
}
