package com.bilgeadam.designpatterns.structural.facade.debt;

import java.math.BigDecimal;
import java.util.Date;

public class Debt {
    private  Long id;
    private BigDecimal debtPrice;
    private TypeOfDebtEnum typeOfDebt;
    private Date expiryDate;

    public Debt() {
    }

    public Debt(Long id, TypeOfDebtEnum typeOfDebt, Date expiryDate, BigDecimal debtPrice) {
        this.id = id;
        this.typeOfDebt = typeOfDebt;
        this.expiryDate = expiryDate;
        this.debtPrice = debtPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeOfDebtEnum getTypeOfDebt() {
        return typeOfDebt;
    }

    public void setTypeOfDebt(TypeOfDebtEnum typeOfDebt) {
        this.typeOfDebt = typeOfDebt;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public BigDecimal getDebtPrice() {
        return debtPrice;
    }

    public void setDebtPrice(BigDecimal debtPrice) {
        this.debtPrice = debtPrice;
    }
}
