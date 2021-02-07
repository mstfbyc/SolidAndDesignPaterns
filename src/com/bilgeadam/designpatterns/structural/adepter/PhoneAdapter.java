package com.bilgeadam.designpatterns.structural.adepter;

public class PhoneAdapter implements IElectricalAppliances{
    private IPhone phone;

    public PhoneAdapter(IPhone phone) {
        this.phone = phone;
    }

    @Override
    public int pushSocketAndRun() {
        return phone.charge();
    }
}
