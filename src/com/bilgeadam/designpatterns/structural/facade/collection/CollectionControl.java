package com.bilgeadam.designpatterns.structural.facade.collection;

import com.bilgeadam.designpatterns.structural.facade.debt.Debt;
import com.bilgeadam.designpatterns.structural.facade.debt.TypeOfDebtEnum;
import com.bilgeadam.designpatterns.structural.facade.legal.LegalControlService;
import com.bilgeadam.designpatterns.structural.facade.rectructuring.RectructuringControlService;

public class CollectionControl {
    private RectructuringControlService rectructuringControlService;
    private LegalControlService legalControlService;

    public CollectionControl() {
        this.rectructuringControlService = new RectructuringControlService();
        this.legalControlService = new  LegalControlService();
    }

    public boolean isCollection(Debt debt){
        boolean isRectructuring = false;
        if(TypeOfDebtEnum.RESTRUCTURING.equals(debt.getTypeOfDebt())){
            isRectructuring = rectructuringControlService.isRectructuringBroken(debt.getExpiryDate());
        }
        boolean isLegalThread = legalControlService.isLegalThread(debt.getId());
        return !(isLegalThread || isRectructuring);
    }
}
