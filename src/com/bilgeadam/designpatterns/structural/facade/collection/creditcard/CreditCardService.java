package com.bilgeadam.designpatterns.structural.facade.collection.creditcard;

import com.bilgeadam.designpatterns.structural.facade.debt.PaymentInformation;

import java.math.BigDecimal;

public class CreditCardService {
    private CreditCardControlService creditCardControlService;

    public CreditCardService() {
        this.creditCardControlService = new CreditCardControlService();
    }
    public boolean tryCollectionDebt(PaymentInformation paymentInformation, BigDecimal amount){
        boolean isCreditCardValid = creditCardControlService.isCrediCardValid(paymentInformation);
        if (!isCreditCardValid){
            return false;
        }
        boolean isLimit = controlLimit(paymentInformation,amount);
        if(!isLimit){
            return false;
        }
        System.out.println("Kredi kartından "+ amount + " ₺ tahsil edilmiştir.");
        return true;
    }

    public boolean controlLimit(PaymentInformation paymentInformation, BigDecimal amount){
        BigDecimal limit = getCrediCardLimit(paymentInformation);
        boolean isLimit = limit.compareTo(amount) >0;
        if(!isLimit){
            System.out.println("Kartta yeterli limit bulunmamaktadır.");
        }
        return isLimit;
    }

    public BigDecimal getCrediCardLimit(PaymentInformation paymentInformation){
        BigDecimal limit = BigDecimal.ZERO;

        String nameOnCard = paymentInformation.getNameOnCard();

        if(nameOnCard.contains("Mustafa")){
            limit= new BigDecimal(100);
        }else if(nameOnCard.contains("Burhab")){
            limit = new BigDecimal(1000);
        }else if(nameOnCard.contains("Sevtap")){
            limit = new BigDecimal(2000);
        }
        return limit;
    }
}
