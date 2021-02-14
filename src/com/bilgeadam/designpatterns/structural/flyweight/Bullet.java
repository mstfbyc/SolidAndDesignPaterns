package com.bilgeadam.designpatterns.structural.flyweight;

import java.util.TreeMap;

public class Bullet {
    private BulletSizeEnum bulletSize;

    public Bullet(BulletSizeEnum bulletSize) {
        this.bulletSize = bulletSize;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void shoot(){
        System.out.println("Tak");
    }
}
