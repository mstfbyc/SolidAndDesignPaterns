package com.bilgeadam.designpatterns.creational.singleton;

public class Singleton {
    private Singleton() {
        System.out.println("Ben oluştum");
    }
    private static  Singleton singleton = new Singleton();
    private static int cout = 0;
    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static int getCout() {
        return cout;
    }

}
