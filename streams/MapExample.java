package com.example.streams;

import com.example.functionalProgramming.Instructor;
import com.example.functionalProgramming.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        //return only instructor names from instructors list
        Set<String> instructorNames= Instructors.getAll().stream().map(Instructor::getName).map(String::toUpperCase).collect(Collectors.toSet());
        System.out.println(instructorNames );
    }
}
