package com.bilgeadam.designpatterns.structural.flyweight;

public enum BulletSizeEnum {
    THREE(3),
    FIVE(5),
    SEVEN(7);

    private Integer size;

    BulletSizeEnum(Integer size) {
        this.size = size;
    }

    public Integer getSize() {
        return size;
    }
}
