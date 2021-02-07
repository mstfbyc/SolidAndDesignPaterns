package com.bilgeadam.designpatterns.structural.composite.before;

import java.math.BigDecimal;

public class BeforeApp {
    public static void main(String[] args) {
        Product tomato = new Product("Domates", BigDecimal.TEN);
        Product potato = new Product("Patetes",BigDecimal.ONE);
        Product onion = new Product("Soğan", BigDecimal.ONE);

        Packet vegetablesPacket = new Packet("Sebze Paketi");
        vegetablesPacket.getProductList().add(tomato);
        vegetablesPacket.getProductList().add(potato);
        vegetablesPacket.getProductList().add(onion);

        Product speekProduct = new Product("Ses sistemi", BigDecimal.valueOf(5000));
        Product headset = new Product("Kulaklık",BigDecimal.valueOf(1000));
        Packet technoPack = new Packet("Teknoloji paketi");
        technoPack.getProductList().add(speekProduct);
        technoPack.getProductList().add(headset);

        Product soccerBall = new Product("Futbol topu",BigDecimal.valueOf(100));

        Basket basket = new Basket("Benim Sepetim");
        basket.getPacketList().add(vegetablesPacket);
        basket.getPacketList().add(technoPack);
        basket.getProductList().add(soccerBall);
        BigDecimal totalPrice = basket.getTotalrice();
        System.out.println("Ödenecek Tutar = "+ totalPrice + "TL");

    }
}
