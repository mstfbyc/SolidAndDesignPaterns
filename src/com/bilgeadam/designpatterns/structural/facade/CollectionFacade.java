package com.bilgeadam.designpatterns.structural.facade;

import com.bilgeadam.designpatterns.structural.facade.collection.CollectionControl;
import com.bilgeadam.designpatterns.structural.facade.collection.creditcard.CreditCardService;
import com.bilgeadam.designpatterns.structural.facade.debt.Debt;
import com.bilgeadam.designpatterns.structural.facade.debt.PaymentInformation;
import com.bilgeadam.designpatterns.structural.facade.delay.CalculateDelayIncreaseService;

import java.math.BigDecimal;
//Rest service Controller
public class CollectionFacade {
    private CalculateDelayIncreaseService calculateDelayIncreaseService;
    private CollectionControl collectionControl;
    private CreditCardService creditCardService;

    public CollectionFacade() {
        this.calculateDelayIncreaseService = new CalculateDelayIncreaseService();
        this.collectionControl = new CollectionControl();
        this.creditCardService = new CreditCardService();
    }
    public boolean payDebt(Debt debt, PaymentInformation paymentInformation){
        boolean isCollection = collectionControl.isCollection(debt);
        if(!isCollection){
            return  false;
        }
        BigDecimal debtPrice = debt.getDebtPrice();
        BigDecimal delayPrice = calculateDelayIncreaseService.calculateDelayIncrease(debtPrice,debt.getExpiryDate());
        BigDecimal totalPrice = debtPrice.add(delayPrice);
        System.out.println("Bilgi: Kredi kartından "+ totalPrice+ "₺ tahsilat deneiyor.");
        boolean isSuccess = creditCardService.tryCollectionDebt(paymentInformation,totalPrice);
        return isSuccess;
    }
}
