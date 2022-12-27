package com.example.streams;

import com.example.functionalProgramming.Instructor;
import com.example.functionalProgramming.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {
    public static void main(String[] args) {
        //returning all instructors sorted by their name
        List<Instructor> listIns= Instructors.getAll().stream()
                .sorted(Comparator.comparing(Instructor::getName))
                .collect(Collectors.toList());

        listIns.forEach(System.out::println);

        //reverse order
        List<Instructor> listInsRev= Instructors.getAll().stream()
                .sorted(Comparator.comparing(Instructor::getName).reversed())
                .collect(Collectors.toList());

        listInsRev.forEach(System.out::println);
    }
}
