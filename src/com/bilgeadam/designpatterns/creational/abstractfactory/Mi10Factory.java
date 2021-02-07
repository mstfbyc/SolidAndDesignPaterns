package com.bilgeadam.designpatterns.creational.abstractfactory;

public class Mi10Factory implements PhoneFactory{
    @Override
    public Phone getPhone(String model, String batary, int width, int height) {
        return new Mi10(model,batary,width,height);
    }
}
