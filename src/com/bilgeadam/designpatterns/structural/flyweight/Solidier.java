package com.bilgeadam.designpatterns.structural.flyweight;

public class Solidier {
    private BulletSizeEnum bulletSize;

    public Solidier(BulletSizeEnum bulletSize) {
        this.bulletSize = bulletSize;
    }
    public void fire(){
        //Bullet bullet = new Bullet(bulletSize);
        Bullet bullet = BulletFactory.makeBullet(bulletSize);
        bullet.shoot();
    }

    public void swept(){

        for (int i = 0; i < 5; i++) {
            fire();
        }

    }
}
