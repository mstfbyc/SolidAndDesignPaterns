package com.bilgeadam.designpatterns.structural.decorator;

import java.util.ArrayList;
import java.util.List;

public class ReportUtil {
    public static String fitText(String text, int width) {
        String smallText ="";
        String[] lines = text.split("\n");

        for (String eachText:lines) {
            if(eachText.length()<=width){
                //aynı kalsın
                smallText = addAndPassNewLine(smallText,eachText);
            }else{
                //Küçült ekle
                List<String> fragmentedTexts = fragment(eachText,width);
                for (String eachNewLine:fragmentedTexts) {
                    smallText = addAndPassNewLine(smallText,eachNewLine);

                }
            }
        }
        return smallText;
    }

    private static List<String> fragment(String eachText, int width) {
        List<String> fragmentedTextList = new ArrayList<>();
        for (int i = 0; i < eachText.length()/30; i++) {
            int firstCount = width * i;
            int lastCount = firstCount + width;

            if(lastCount > eachText.length()){
                lastCount = eachText.length();
            }
            String fragmentedText = eachText.substring(firstCount,lastCount);
            if(fragmentedText.trim().length()>0){
                fragmentedTextList.add(fragmentedText);
            }
        }
        return fragmentedTextList;
    }

    private static String addAndPassNewLine(String smallText, String eachText) {
        return smallText + eachText +"\n";
    }

    public static String getStripedText(String text) {
        String[] lineList = text.split("\n");
        String stripedLine = "";
        for (String eachText:lineList) {
            String stripedText = addStripedEachLine(eachText);
            stripedLine = stripedLine+stripedText;
        }
        return stripedLine;
    }

    private static String addStripedEachLine(String eachText) {
        String newLine;
        if(eachText.trim().length()==0){
            newLine ="\n";
        }else{
            newLine ="\n-"+eachText;
        }
        return newLine;
    }

    public static String addLastLineSing(String text) {
        String sing = "\n\n + \t\t\t\t\t\t İmza: ";
        return text + sing;
    }
}
