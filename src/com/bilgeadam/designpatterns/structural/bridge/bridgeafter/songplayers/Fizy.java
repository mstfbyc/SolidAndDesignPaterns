package com.bilgeadam.designpatterns.structural.bridge.bridgeafter.songplayers;

import com.bilgeadam.designpatterns.structural.bridge.bridgeafter.Song;

public class Fizy implements ISongPlayers{
    @Override
    public String playSong(Song song) {
        System.out.println("Fizy "+song + " şarkısını çalıyor.");
        return song.getSound();
    }
}
