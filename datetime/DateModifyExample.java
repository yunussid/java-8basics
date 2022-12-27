package com.example.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateModifyExample {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        //4 days from now
        localDate=localDate.plusDays(4);
        System.out.println("localDate = " + localDate.plusDays(4));
        System.out.println("localDate = " + localDate);
        localDate=LocalDate.now();
        System.out.println("localDate = " + localDate);

        System.out.println("localDate = " + localDate.plusMonths(2));
        System.out.println("localDate = " + localDate.plusYears(2));
        System.out.println("localDate.minusDays = " + localDate.minusDays(10));
        System.out.println("localDate = " + localDate.withYear(2023));

        //exp with cronofield
        System.out.println("localDatewith(ChronoField = " + localDate.with(ChronoField.YEAR,2025));
        System.out.println("localDate with(TemporalAdjusters= " + localDate.with(TemporalAdjusters.lastDayOfMonth()));

    }
}
