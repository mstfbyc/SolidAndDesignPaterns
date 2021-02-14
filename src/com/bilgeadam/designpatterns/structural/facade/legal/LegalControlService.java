package com.bilgeadam.designpatterns.structural.facade.legal;

import java.util.List;

public class LegalControlService {
    private LegalTımeEntityService legalTımeEntityService;

    public LegalControlService() {
        this.legalTımeEntityService = new LegalTımeEntityService();
    }

    public boolean isLegalThread(Long debtId){
        List<Long> legalList = legalTımeEntityService.findAllLegalThread();
        boolean isLegalThread = legalList.contains(debtId);
        if(isLegalThread){
            System.out.println("Borç hukuksal süreçte. Tahsil edilemez!");
        }
        return isLegalThread;
    }
}
