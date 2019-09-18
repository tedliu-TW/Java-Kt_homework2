package com.ted1.parking;

import javafx.scene.input.DataFormat;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
    LocalDateTime enter=
            LocalDateTime.of(2019,01,01,10,0);
    LocalDateTime Leave=
            LocalDateTime.of(2019,01,01,11,10);


    Car car =new Car("AA-0001",enter);
    car.setLeave(Leave);
        System.out.println(car.getDuration());

     long hour =(long) Math.ceil(car.getDuration()/60.0);
        System.out.println(hour);
        System.out.println(hour*30);


 //ctrl+ alt + m
        //       Java();
//        Java 8
 //      Java8();


    }

    private static void Java8() {
        Instant instant = Instant.now();
        System.out.println(instant);
        //Local
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));
        now.plus(Duration.ofHours(3));
        System.out.println(now.plus(Duration.ofHours(3)));


        LocalDateTime other =
                LocalDateTime.of(2018,11,23,8,0,0);
        System.out.println(other);
    }

    private static void Java() {
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
