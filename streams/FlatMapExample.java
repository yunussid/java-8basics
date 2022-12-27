package com.example.streams;

import com.example.functionalProgramming.Instructor;
import com.example.functionalProgramming.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        //Get a list of all the courses which instructor offers

        Set<String> instructorCourses=Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream).collect(Collectors.toSet());
        System.out.println(instructorCourses);
    }
}
