package com.bilgeadam.designpatterns.structural.facade.debt;

public class PaymentInformation {
    private String nameOnCard;
    private String cardNumber;
    private Long expiryMonth;
    private Long expiryYear;
    private Long cvvNo;

    public PaymentInformation() {
    }

    public PaymentInformation(String nameOnCard, String cardNumber, Long expiryMonth, Long expiryYear, Long cvvNo) {
        this.nameOnCard = nameOnCard;
        this.cardNumber = cardNumber;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.cvvNo = cvvNo;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Long getExpiryMonth() {
        return expiryMonth;
    }

    public void setExpiryMonth(Long expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public Long getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(Long expiryYear) {
        this.expiryYear = expiryYear;
    }

    public Long getCvvNo() {
        return cvvNo;
    }

    public void setCvvNo(Long cvvNo) {
        this.cvvNo = cvvNo;
    }
}
