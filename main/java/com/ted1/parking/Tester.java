package com.ted1.parking;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        SimpleDateFormat sdf =new SimpleDateFormat();
        sdf.applyPattern("yyyy/MM/dd HH:mm:ss") ;

        System.out.println(sdf.format(date));
        String s ="2013/01/22 09:00:00";
        Date other = null;
        try{
            other = sdf.parse(s);
            System.out.println(other);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar =Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,9);
        System.out.println(calendar.getTime());
        calendar.add(calendar.DAY_OF_YEAR,3);
        System.out.println(calendar.getTime());






    }
}
