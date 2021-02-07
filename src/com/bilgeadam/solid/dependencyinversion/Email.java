package com.bilgeadam.solid.dependencyinversion;

public class Email implements Message{
    public void sendMail(){
        //SEnd email
    }

    @Override
    public void sendMessage() {
        sendMail();
    }
}
