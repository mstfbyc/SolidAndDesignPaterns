package com.bilgeadam.designpatterns.structural.adepter;

public class Fridge implements IElectricalAppliances{
    private int volt;

    public Fridge() {
        this.volt = 220;
    }

    @Override
    public int pushSocketAndRun() {
        System.out.println("Buzdolabı çalışıyor");
        return volt;
    }
}
