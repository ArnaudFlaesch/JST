package com.jst.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Arnaud
 */
public class DateUtils {
    private static final SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
    
    public static Date minusOneWeek() {
        Calendar dateMinusOneWeek = Calendar.getInstance();
        dateMinusOneWeek.add(Calendar.DATE, -7);
        return (dateMinusOneWeek.getTime());
    }
    
    public static Date minusOneMonth() {
        Calendar dateMinusOneWeek = Calendar.getInstance();
        dateMinusOneWeek.add(Calendar.MONTH, -1);
        return (dateMinusOneWeek.getTime());
    }
    
    public static Date minusOneYear() {
        Calendar dateMinusOneWeek = Calendar.getInstance();
        dateMinusOneWeek.add(Calendar.YEAR, -1);
        return (dateMinusOneWeek.getTime());
    }
    
    public static String format(Date dateToFormat) {
        return (formatDate.format(dateToFormat));
    }
}