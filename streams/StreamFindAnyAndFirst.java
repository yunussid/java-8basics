package com.example.streams;

import com.example.functionalProgramming.Instructor;
import com.example.functionalProgramming.Instructors;

import java.util.Optional;

public class StreamFindAnyAndFirst {
    public static void main(String[] args) {
        Optional<Instructor> instructor= Instructors.getAll().stream()
                .findAny();
        if (instructor.isPresent())
            System.out.println(instructor.get());
        instructor=Instructors.getAll().stream().findFirst();
        if (instructor.isPresent())
            System.out.println(instructor.get());

    }
}
