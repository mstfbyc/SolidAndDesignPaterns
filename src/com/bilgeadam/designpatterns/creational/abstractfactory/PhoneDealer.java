package com.bilgeadam.designpatterns.creational.abstractfactory;

public class PhoneDealer {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new Note20Factory();
        phoneFactory.getPhone("Note20","4600mah",4,3);
        PhoneFactory phoneFactory2 = new Mi10Factory();
        phoneFactory2.getPhone("Mi10","4600mah",4,3);

    }
}
