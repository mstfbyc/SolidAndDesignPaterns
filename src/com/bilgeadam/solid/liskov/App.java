package com.bilgeadam.solid.liskov;

public class App {
    public static void main(String[] args) {
/*        Rectangle rectangle = new Square();
        rectangle.setWidth(20);
        rectangle.setHeight(4);
        System.out.println(rectangle.area());*/
        Shape regtangle = new Rectangle(10,5);
        System.out.println(regtangle.getArea());
        Shape square = new Square(5);
        System.out.println(square.getArea());
    }
}
