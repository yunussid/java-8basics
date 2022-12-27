package com.example.streams;

import com.example.functionalProgramming.Instructor;
import com.example.functionalProgramming.Instructors;

import java.util.stream.Collectors;

public class CountingExample {
    public static void main(String[] args) {
        //count the number of instructor who teaches online course
        //stream.count
        long count= Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .count();
        System.out.println("count = " + count);

        //collectors.counting
        count=Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .collect(Collectors.counting());
        System.out.println("count = " + count);
    }
}
