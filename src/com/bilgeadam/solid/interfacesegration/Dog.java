package com.bilgeadam.solid.interfacesegration;

public class Dog implements IBark,IRun{

    @Override
    public void run() {
        System.out.println("Köpekler koşar");
    }

    @Override
    public void bark() {
        System.out.println("Köpekler havlar.");
    }
}
