package com.bilgeadam.designpatterns.creational.factory;

public class PhoneDealer {
    public static void main(String[] args) {
/*        Note20 note20 = new Note20("Note 20","420mah",6,12);
        System.out.println(note20);*/
        Phone phone = PhoneFactory.getPhone("Note20","420mah",6,12);
        System.out.println(phone);

    }
}
