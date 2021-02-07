package com.bilgeadam.designpatterns.structural.proxy;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        ManagerProxy managerProxy = new ManagerProxy("Cemre","12345");
        try {
            BigDecimal ciro = managerProxy.getCiro();
            System.out.println("Şirket Cirosu: "+ciro);
        } catch (IllegalAccessException e) {
            System.out.println("Hassas bilgilere erişiminiz yoktur!");
        }
    }
}
