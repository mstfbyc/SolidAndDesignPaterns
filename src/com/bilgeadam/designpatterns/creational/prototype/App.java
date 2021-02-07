package com.bilgeadam.designpatterns.creational.prototype;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        GeneralEntityService generalEntityService = new GeneralEntityService();
        Date startTime = new Date();
        Document document1 = generalEntityService.findDocumentByID(1l);
        Date endTime = new Date();
        System.out.println(document1);
        System.out.println(getCostYime(startTime,endTime)+" Saniye sürdü");

        Date startTime2 = new Date();
        Document document2 = generalEntityService.findDocumentByID(1l);
        Date endTime2 = new Date();
        System.out.println(document1);
        System.out.println(getCostYime(startTime2,endTime2)+" Saniye sürdü");

        Date startTime3 = new Date();
        Document clone = null;
        try {
            clone = document1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Date endTime3 = new Date();
        System.out.println(document1);
        System.out.println(getCostYime(startTime3,endTime3)+" Saniye sürdü");

        clone.getDocumentType().setName("Kişisel-2");
        System.out.println(clone);
        System.out.println(document1);
    }

    private static Long getCostYime(Date startTime, Date endTime){
        return ((endTime.getTime()-startTime.getTime())/1000);
    }
}
