package com.example.streams;

import com.example.functionalProgramming.Instructor;
import com.example.functionalProgramming.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class filterExample {
    public static void main(String[] args) {
        //return instructors sorted by their name and have more than 10 yrs exp
        List<Instructor> list= Instructors.getAll().stream()
                .filter(instructor -> instructor.getYearsOfExperience()>10)
                .sorted(Comparator.comparing(Instructor::getName))
                .collect(Collectors.toList());

        list.forEach(System.out::println );

    }
}
