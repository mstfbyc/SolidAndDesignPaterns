package com.bilgeadam.designpatterns.creational.abstractfactory;

public interface PhoneFactory {
    Phone getPhone(String model, String batary, int width, int height);
}
