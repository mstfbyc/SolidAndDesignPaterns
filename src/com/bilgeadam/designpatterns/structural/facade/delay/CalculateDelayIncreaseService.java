package com.bilgeadam.designpatterns.structural.facade.delay;

import com.bilgeadam.designpatterns.structural.facade.DateUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class CalculateDelayIncreaseService {
    private CalculateDelayIncreaseRateEntityService calculateDelayIncreaseRateService;

    public CalculateDelayIncreaseService() {
        this.calculateDelayIncreaseRateService = new CalculateDelayIncreaseRateEntityService();
    }

    public BigDecimal calculateDelayIncrease(BigDecimal amount, Date expiryDate){
        BigDecimal delayIncraese = BigDecimal.ZERO;
        if(expiryDate.compareTo(new Date())>0){
            return delayIncraese;
        }
        delayIncraese = calculateDelayPrice(amount,expiryDate);
        return delayIncraese;
    }
    private BigDecimal calculateDelayPrice(BigDecimal amount, Date expiryDate ){
        BigDecimal delayIncreaseRate = calculateDelayIncreaseRateService.getCalculateDelayIncreaseRate();
        Date today = DateUtil.getTodayDate();
        long dayDifference = DateUtil.calculateDayDifference(expiryDate,today);
        // Gecikme Ücreti = gecikme oranı * gün farkı * fatura tutarı
        BigDecimal delayPrice = delayIncreaseRate.multiply(BigDecimal.valueOf(dayDifference)).multiply(amount);
        delayPrice = delayPrice.setScale(2, RoundingMode.HALF_UP);
        if(delayPrice.compareTo(BigDecimal.ZERO)>0){
            System.out.println("Bilgi: Gecikme zammı hesaplandı. Gecikme Zammı Tutarı: "+ delayPrice);
        }
        return delayPrice;
    }
}
