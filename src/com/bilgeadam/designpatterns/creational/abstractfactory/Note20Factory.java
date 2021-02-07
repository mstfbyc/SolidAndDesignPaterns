package com.bilgeadam.designpatterns.creational.abstractfactory;

public class Note20Factory implements PhoneFactory{
    @Override
    public Phone getPhone(String model, String batary, int width, int height) {
        return new Note20(model,batary,width,height);
    }
}
