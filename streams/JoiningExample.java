package com.example.streams;

import com.example.functionalProgramming.Instructor;
import com.example.functionalProgramming.Instructors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
    public static void main(String[] args) {
        String result= Stream.of("E","F","G","H").collect(Collectors.joining());
        System.out.println(result);

        result=Stream.of("E","F","G","H").collect(Collectors.joining(","));
        System.out.println(result);

        result=Stream.of("E","F","G","H").collect(Collectors.joining(",","{","}"));
        System.out.println(result);

        //instructor names seperated by , and prefix { and suffix }
        String namesConactenated= Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.joining(",","{","}"));
        System.out.println("namesConcatenated = "+namesConactenated);
    }
}
