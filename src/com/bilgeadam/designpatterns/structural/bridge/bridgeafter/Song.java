package com.bilgeadam.designpatterns.structural.bridge.bridgeafter;

public class Song {
    private String name;
    private String sound;

    public Song(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
