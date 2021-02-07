package com.bilgeadam.designpatterns.structural.bridge.bridgeafter.devices;

import com.bilgeadam.designpatterns.structural.bridge.bridgeafter.Song;
import com.bilgeadam.designpatterns.structural.bridge.bridgeafter.songplayers.ISongPlayers;
import com.bilgeadam.designpatterns.structural.bridge.bridgeafter.spekerdevices.SpekerDevices;

public class Phone extends CanPlaySongDevices{
    public Phone(ISongPlayers songPlayers, SpekerDevices spekerDevices) {
        super(songPlayers, spekerDevices);
    }

    @Override
    public void playSong(Song song) {
        System.out.println("Telefon müzik çalıyor.");
        super.playSong(song);
    }
}
