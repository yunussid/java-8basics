package com.example.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class localTimeExample {
    public static void main(String[] args) {
        LocalTime localTime=LocalTime.now();
        System.out.println("localTime = " + localTime);

        localTime=LocalTime.of(15,18);
        System.out.println("localTime = " + localTime);

        localTime=LocalTime.of(15,18,20);
        System.out.println("localTime = " + localTime);

        localTime =LocalTime.of(15,18,23,34567890);
        System.out.println("localTime = " + localTime);

        //get
        System.out.println("localTime = " + localTime.getHour());
        System.out.println("localTime = " + localTime.getMinute());
        System.out.println("localTime.getSecond() = " + localTime.getSecond());
        System.out.println("localTime.getNano() = " + localTime.getNano());

        System.out.println("localTime.get(ChronoField.SECOND_OF_DAY) = " + localTime.get(ChronoField.SECOND_OF_DAY));
        System.out.println("localTime.get(ChronoField.MINUTE_OF_DAY) = " + localTime.get(ChronoField.MINUTE_OF_DAY));

    }
}
