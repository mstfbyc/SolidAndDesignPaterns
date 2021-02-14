package com.bilgeadam.designpatterns.structural.flyweight;

import java.util.LinkedHashMap;
import java.util.Map;

public class BulletFactory {
    private static Map<BulletSizeEnum,Bullet> map = new LinkedHashMap<>();
    public static Bullet makeBullet(BulletSizeEnum bulletSize){
        Bullet bullet = map.get(bulletSize);
        if(bullet == null){
            bullet = new Bullet(bulletSize);
            map.put(bulletSize,bullet);
        }
        return bullet;
    }
}
