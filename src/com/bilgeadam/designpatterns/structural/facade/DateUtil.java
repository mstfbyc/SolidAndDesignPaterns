package com.bilgeadam.designpatterns.structural.facade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static Date getTodayDate(){
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        String dateStr = format.format(new Date());

        Date date = null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static long calculateDayDifference(Date fistDate, Date endDate){
        long dayCoefficient = 24 * 60 * 60 *1000;
        long first = fistDate.getTime();
        long end = endDate.getTime();
        long differenceDay = (end /dayCoefficient) - (first/dayCoefficient);
        return differenceDay;
    }

    public static Long dateOfYear(Date date){
        String yearStr = new SimpleDateFormat("yyyy").format(date);
        return Long.valueOf(yearStr);
    }

    public static Long dateOfMonth(Date date){
        String monthStr = new SimpleDateFormat("MM").format(date);
        return Long.valueOf(monthStr);
    }

    public static  Date createDate(String dateStr){
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date = null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }


}
