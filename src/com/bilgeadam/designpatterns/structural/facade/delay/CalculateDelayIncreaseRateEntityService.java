package com.bilgeadam.designpatterns.structural.facade.delay;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculateDelayIncreaseRateEntityService {

    /**
     * Gecikme Zammı oranını döner.
     * @return
     */
    public BigDecimal getCalculateDelayIncreaseRate(){
        BigDecimal rate = new BigDecimal("2.1");
        rate = rate.divide(new BigDecimal(100),4, RoundingMode.HALF_UP);
        return rate;
    }
}
