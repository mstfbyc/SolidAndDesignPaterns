package com.bilgeadam.designpatterns.structural.bridge.bridgeafter.spekerdevices;

public class Headset implements SpekerDevices{
    @Override
    public void playSound(String sound) {
        System.out.println("Kulaklık ses çalıyor -> "+ sound);
    }
}
