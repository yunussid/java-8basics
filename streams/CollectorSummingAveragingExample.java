package com.example.streams;

import com.example.functionalProgramming.Instructor;
import com.example.functionalProgramming.Instructors;

import java.util.stream.Collectors;

public class CollectorSummingAveragingExample {
    public static void main(String[] args) {
        //sum of years of exp of all instructor
        int sum = Instructors.getAll().stream()
                .collect(Collectors.summingInt(Instructor::getYearsOfExperience));
        System.out.println("sum = " + sum);

        //avg of years of exp of all instructor
        double avg=Instructors.getAll().stream()
                .collect(Collectors.averagingInt(Instructor::getYearsOfExperience));
        System.out.println("avg = " + avg);
    }
}
