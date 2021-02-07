package com.bilgeadam.designpatterns.structural.bridge.bridgebefore;

public class Spotify {
    public String playSong(Song song){
        System.out.println("Spotify "+ song+ " şarkısını çalıyor.");
        return song.getSound();
    }
}
