package com.bilgeadam.designpatterns.structural.bridge.bridgeafter.devices;

import com.bilgeadam.designpatterns.structural.bridge.bridgeafter.Song;
import com.bilgeadam.designpatterns.structural.bridge.bridgeafter.songplayers.Fizy;
import com.bilgeadam.designpatterns.structural.bridge.bridgeafter.spekerdevices.Headset;

public class Computer extends CanPlaySongDevices{
    public Computer() {
        songPlayers = new Fizy();
        spekerDevices = new Headset();
    }

    @Override
    public void playSong(Song song) {
        System.out.println("Bilgisayar Çalışıyor.");
        super.playSong(song);
    }
}
