package com.bilgeadam.solid.dependencyinversion;

public class SMS implements Message{
    public void sendSms(){
        //Send SMS
    }

    @Override
    public void sendMessage() {
        sendSms();
    }
}
