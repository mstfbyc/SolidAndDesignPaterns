package com.bilgeadam.designpatterns.structural.facade.legal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LegalTımeEntityService {
    public List<Long> findAllLegalThread(){
        List<Long> legalList = Arrays.asList(3L,4L);
        return legalList;
    }
}
