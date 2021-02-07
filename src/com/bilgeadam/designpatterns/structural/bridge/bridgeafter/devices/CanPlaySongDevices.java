package com.bilgeadam.designpatterns.structural.bridge.bridgeafter.devices;

import com.bilgeadam.designpatterns.structural.bridge.bridgeafter.Song;
import com.bilgeadam.designpatterns.structural.bridge.bridgeafter.songplayers.ISongPlayers;
import com.bilgeadam.designpatterns.structural.bridge.bridgeafter.spekerdevices.SpekerDevices;

public abstract class CanPlaySongDevices {
    protected ISongPlayers songPlayers;
    protected SpekerDevices spekerDevices;

    public CanPlaySongDevices() {
    }

    public CanPlaySongDevices(ISongPlayers songPlayers, SpekerDevices spekerDevices) {
        this.songPlayers = songPlayers;
        this.spekerDevices = spekerDevices;
    }
    public void playSong(Song song){
        String sound = songPlayers.playSong(song);
        spekerDevices.playSound(sound);
    }

}
