package com.bilgeadam.designpatterns.structural.adepter;

public class App {

    public static void main(String[] args) {
        Socket socket = new Socket();
        Iron iron = new Iron();
        Fridge fridge = new Fridge();

        socket.giveElectric(iron);
        socket.giveElectric(fridge);

        SamsungPhone samsungPhone = new SamsungPhone();
        PhoneAdapter adapter = new PhoneAdapter(samsungPhone);
        socket.giveElectric(adapter);
    }
}
