package com.bilgeadam.designpatterns.structural.bridge.bridgebefore;

public class App {
    public static void main(String[] args) {
        Song song = new Song("Sezen Aksu - Gülümse","Gülümse hadi Gülümse");
        Computer computer = new Computer();
        computer.playMusic(song);
    }
}
