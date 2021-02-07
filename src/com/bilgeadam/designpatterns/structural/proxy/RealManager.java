package com.bilgeadam.designpatterns.structural.proxy;

import java.math.BigDecimal;

public class RealManager implements ICompanyInfo{
    @Override
    public BigDecimal getCiro() throws IllegalAccessException {
        return BigDecimal.valueOf(1_000_000);
    }
}
