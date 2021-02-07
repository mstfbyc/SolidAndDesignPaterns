package com.bilgeadam.designpatterns.structural.bridge.bridgeafter;


import com.bilgeadam.designpatterns.structural.bridge.bridgeafter.devices.Computer;
import com.bilgeadam.designpatterns.structural.bridge.bridgeafter.devices.Phone;
import com.bilgeadam.designpatterns.structural.bridge.bridgeafter.songplayers.Fizy;
import com.bilgeadam.designpatterns.structural.bridge.bridgeafter.spekerdevices.Headset;

public class App {
    public static void main(String[] args) {
        Song song = new Song("Sezen Aksu - Gülümse","Gülümse hadi Gülümse");
        Computer computer = new Computer();
        computer.playSong(song);

        System.out.println("************************");
        Phone phone = new Phone(new Fizy(),new Headset());
        phone.playSong(song);
    }
}
