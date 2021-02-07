package com.bilgeadam.designpatterns.structural.adepter;

public class Socket {

    public void giveElectric(IElectricalAppliances electricalAppliances){
        int volt = electricalAppliances.pushSocketAndRun();
        System.out.println("Prizden "+ volt + " volt alınıyor.");
    }
}
