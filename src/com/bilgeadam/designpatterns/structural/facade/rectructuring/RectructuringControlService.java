package com.bilgeadam.designpatterns.structural.facade.rectructuring;

import com.bilgeadam.designpatterns.structural.facade.DateUtil;

import java.util.Date;

public class RectructuringControlService {

    public boolean isRectructuringBroken(Date expiryDate){
        Date today = DateUtil.getTodayDate();
        long dayDifference = DateUtil.calculateDayDifference(expiryDate,today);
        boolean isBroken = dayDifference > 90;
        if (isBroken){
            System.out.println("Borcun yapılandırması bozuldu! Tahsil Edilemez!");
        }
        return isBroken;
    }
}
