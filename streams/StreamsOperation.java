package com.example.streams;

import com.example.functionalProgramming.Instructor;
import com.example.functionalProgramming.Instructors;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsOperation {
    public static void main(String[] args) {
        //count distinct
        Long instructorsCoursesNo= Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .count();
        System.out.println(instructorsCoursesNo);

        //distinct
        List<String> instructorsCoursesUniq= Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(instructorsCoursesUniq);

        //Any match,allmatch, and nonmatch
        boolean match=Instructors.getAll().stream()
                .map(Instructor::getCourses)
                 .flatMap(List::stream)
                .noneMatch(s-> s.startsWith("J"));

        System.out.println(match);
    }
}
