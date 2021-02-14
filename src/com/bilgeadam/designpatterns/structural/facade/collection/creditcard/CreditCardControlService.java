package com.bilgeadam.designpatterns.structural.facade.collection.creditcard;

import com.bilgeadam.designpatterns.structural.facade.DateUtil;
import com.bilgeadam.designpatterns.structural.facade.debt.PaymentInformation;

import java.util.Date;

public class CreditCardControlService {

    public boolean isCrediCardValid(PaymentInformation paymentInformation){
        Long expiryMonth = paymentInformation.getExpiryMonth();
        Long expiryYear = paymentInformation.getExpiryYear();
        Date dateOfToday = DateUtil.getTodayDate();

        Long monthOfDay = DateUtil.dateOfMonth(dateOfToday);
        Long yearOfDay = DateUtil.dateOfYear(dateOfToday);
        boolean isCrediCardValid = false;
        if(expiryYear.compareTo(yearOfDay)>0){
            isCrediCardValid = true;
        }else if(expiryYear.compareTo(yearOfDay)==0){
            if(expiryMonth.compareTo(monthOfDay)>=0){
                isCrediCardValid= true;
            }
        }
        return isCrediCardValid;
    }
}
