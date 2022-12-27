package com.example.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {
    public static void main(String[] args) {
        //creating LocalDate
        LocalDate localDate=LocalDate.now();
        System.out.println("localDate = " + localDate);

        //using day of the year
        localDate=LocalDate.ofYearDay(2018,35);
        System.out.println("localDate = " + localDate);

        //using localdateof
        localDate=LocalDate.of(2018,05,23);
        System.out.println("localDate = " + localDate);

        localDate=LocalDate.now();
        //Get Methods
        System.out.println("localDate.getMonth = " + localDate.getMonth());
        System.out.println("localDate.getMonthValue = " + localDate.getMonthValue());
        System.out.println("localDate.getDayOfWeek = " + localDate.getDayOfWeek());
        System.out.println("localDate.getDayOfYear = " + localDate.getDayOfYear());
        System.out.println("localDate.get(ChronoField.MONTH_OF_YEAR) = " + localDate.get(ChronoField.MONTH_OF_YEAR));
    }
}
