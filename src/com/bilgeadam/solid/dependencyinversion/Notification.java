package com.bilgeadam.solid.dependencyinversion;

import java.util.List;

public class Notification {
    List<Message> messages;

    public Notification(List<Message> messages) {
        this.messages = messages;
    }
    public void sender(){
        for (Message message:messages) {
            message.sendMessage();
        }
    }

    /*
    private Email email = new Email();
    private SMS  sms = new SMS();

    public void sender(){
        email.sendMail();
        sms.sendSms();
    }*/
}
