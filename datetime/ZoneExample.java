package com.example.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneExample {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream()
                .forEach(System.out::println);
        System.out.println("Asia/Kolkata "+ ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));

    }
}
