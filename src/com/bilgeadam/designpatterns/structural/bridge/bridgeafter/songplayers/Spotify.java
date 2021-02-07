package com.bilgeadam.designpatterns.structural.bridge.bridgeafter.songplayers;

import com.bilgeadam.designpatterns.structural.bridge.bridgeafter.Song;

public class Spotify implements ISongPlayers{
    @Override
    public String playSong(Song song) {
        System.out.println("Soptify "+song + " şarkısını çalıyor.");
        return song.getSound();
    }
}
