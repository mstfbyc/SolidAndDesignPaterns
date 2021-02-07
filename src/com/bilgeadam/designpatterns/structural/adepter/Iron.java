package com.bilgeadam.designpatterns.structural.adepter;

public class Iron implements IElectricalAppliances{
    private int volt;

    public Iron() {
        this.volt = 220;
    }

    @Override
    public int pushSocketAndRun() {
        System.out.println("Ütü çalışıyor....");
        return volt;
    }
}
