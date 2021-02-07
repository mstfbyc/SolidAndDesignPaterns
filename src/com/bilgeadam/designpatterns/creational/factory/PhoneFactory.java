package com.bilgeadam.designpatterns.creational.factory;

public class PhoneFactory {
    public static Phone getPhone(String model, String batary, int width, int height){
        Phone phone;
        if("Note20".equalsIgnoreCase(model)){
            phone = new Note20(model,batary,width,height);
        }else if("Mi10".equalsIgnoreCase(model)){
            phone = new Mi10(model,batary,width,height);
        }else{
            throw new RuntimeException("Geçerli bir model değil");
        }
        return phone;
    }
}
