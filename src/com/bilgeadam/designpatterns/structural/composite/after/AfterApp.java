package com.bilgeadam.designpatterns.structural.composite.after;


import java.math.BigDecimal;

public class AfterApp {

    public static void main(String[] args) {
        Product tomato = new Product("Domates", BigDecimal.TEN);
        Product potato = new Product("Patetes", BigDecimal.ONE);
        Product onion = new Product("Soğan", BigDecimal.ONE);

        Packet vegetablesPacket = new Packet("Sebze Paketi");
        vegetablesPacket.getProductList().add(tomato);
        vegetablesPacket.getProductList().add(potato);
        vegetablesPacket.getProductList().add(onion);

        Product speekProduct = new Product("Ses sistemi", BigDecimal.valueOf(5000));
        Product headset = new Product("Kulaklık", BigDecimal.valueOf(1000));
        Packet technoPack = new Packet("Teknoloji paketi");
        technoPack.getProductList().add(speekProduct);
        technoPack.getProductList().add(headset);

        Product soccerBall = new Product("Futbol topu", BigDecimal.valueOf(100));

        Product oil = new Product("Yağ",BigDecimal.valueOf(100));

        AidPackage aidPackage = new AidPackage("Ramazan Kumanyası");
        aidPackage.getPacketList().add(vegetablesPacket);
        aidPackage.getProductList().add(oil);

        Basket basket = new Basket("Benim Sepetim");
        basket.getPriceableList().add(vegetablesPacket);
        basket.getPriceableList().add(technoPack);
        basket.getPriceableList().add(soccerBall);
        basket.getPriceableList().add(aidPackage);

        BigDecimal totalPrice = basket.getTotalPrice();
        System.out.println("Ödenecek tutar: "+totalPrice+ "₺");

    }
}
