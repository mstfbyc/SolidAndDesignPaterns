package com.bilgeadam.designpatterns.creational.singleton;

public class App {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton);
        System.out.println(singleton2);
        System.out.println(Singleton.getCout());
    }
}
