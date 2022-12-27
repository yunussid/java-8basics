package com.example.streams;

import com.example.functionalProgramming.Instructor;
import com.example.functionalProgramming.Instructors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMinMaxExp {
    public static void main(String[] args) {
        //instructors with minimum years of exp
        Optional<Instructor> instructor= Instructors.getAll().stream()
                .collect(Collectors.minBy(Comparator.comparing(
                        Instructor::getYearsOfExperience
                )));
        System.out.println("instructor min = " + instructor);
        instructor=Instructors.getAll().stream()
                .min(Comparator.comparing(Instructor::getYearsOfExperience));
        System.out.println("instructor min = " + instructor);

        System.out.println("----------------");
        instructor=Instructors.getAll().stream()
                .collect(Collectors.maxBy(Comparator.comparing(
                        Instructor::getYearsOfExperience
                )));
        System.out.println("instructor max = " + instructor);
        instructor=Instructors.getAll().stream()
                .max(Comparator.comparing(Instructor::getYearsOfExperience));
        System.out.println("instructor max = " + instructor);
    }
}
