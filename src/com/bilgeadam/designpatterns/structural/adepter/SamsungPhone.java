package com.bilgeadam.designpatterns.structural.adepter;



public class SamsungPhone implements IPhone {
    private int workVoltaj;

    public SamsungPhone() {
        workVoltaj = 5;
    }

    @Override
    public int charge() {
        System.out.println("Telefon şarj oluyor...");
        return workVoltaj;
    }
}
