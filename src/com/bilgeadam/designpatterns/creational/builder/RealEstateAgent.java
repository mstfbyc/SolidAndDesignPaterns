package com.bilgeadam.designpatterns.creational.builder;

public class RealEstateAgent {
    public static void main(String[] args) {
        //Home home1 = new Home("İstanabul","Bakırkoy","İncirli",5,0,3,100,3);
        Home home = Home.HomeBuilder.builder()
                .city("İstanbul")
                .homeOld(5)
                .balconyCount(3)
                .roomCount(3)
                .county("Bakirköy")
                .build();
        System.out.println(home);
    }
}
