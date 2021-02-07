package com.bilgeadam.designpatterns.structural.bridge.bridgebefore;

public class Computer {
    private Spotify spotify;
    private Speaker speaker;

    public Computer(){
        this.spotify = new Spotify();
        this.speaker = new Speaker();
    }

    public void  playMusic(Song song){
        System.out.println("Bilgisayar çalıştı.");
        String sound = spotify.playSong(song);
        speaker.playSound(sound);
    }

    public Spotify getSpotify() {
        return spotify;
    }

    public void setSpotify(Spotify spotify) {
        this.spotify = spotify;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
}
