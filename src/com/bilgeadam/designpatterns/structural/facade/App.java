package com.bilgeadam.designpatterns.structural.facade;

import com.bilgeadam.designpatterns.structural.facade.debt.Debt;
import com.bilgeadam.designpatterns.structural.facade.debt.PaymentInformation;
import com.bilgeadam.designpatterns.structural.facade.debt.TypeOfDebtEnum;

import java.math.BigDecimal;
import java.util.Date;

public class App {

    //UI veya web sayfası
    public static void main(String[] args) {
        CollectionFacade collectionFacade = new CollectionFacade();

        Long id = 1L;
        BigDecimal debtPrice = new BigDecimal(2000);
        TypeOfDebtEnum typeOfDebtEnum = TypeOfDebtEnum.NORMAL;
        Date expiryDate = DateUtil.createDate("14.02.2021");
        Debt debt = new Debt(id,typeOfDebtEnum,expiryDate,debtPrice);
        PaymentInformation paymentInformation = new PaymentInformation("Mustafa Boyacı","1234567899",12L,2024L,777L);
        boolean isSuccess = collectionFacade.payDebt(debt,paymentInformation);
        if(isSuccess){
            System.out.println("Tahsilat Yapıldı");
        }else{
            System.out.println("Tahsilat Yapılamadı");
        }
    }
}
