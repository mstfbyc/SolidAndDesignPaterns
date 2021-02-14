package com.bilgeadam.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Solidier> solidierList = new ArrayList<>();

        Caption caption = new Caption();
         solidierList.add(caption);

        for (int i = 0; i < 50; i++) {
            Ranker ranker = new Ranker();
            solidierList.add(ranker);
        }
        for (Solidier solidier:solidierList) {
            solidier.fire();
        }
        for (Solidier solidier:solidierList) {
            solidier.swept();
        }
    }
}
