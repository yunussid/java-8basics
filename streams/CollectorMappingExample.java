package com.example.streams;

import com.example.functionalProgramming.Instructor;
import com.example.functionalProgramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorMappingExample {
    public static void main(String[] args) {
        //map
        List<String> namesList= Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.toList());
        namesList.forEach(System.out::println);

        //mapping
        namesList=Instructors.getAll().stream()
                .collect(Collectors.mapping(Instructor::getName,Collectors.toList()));
        namesList.forEach(System.out::println);

        //Instructors by theirs years of exp
        Map<Integer,List<String>> mapYearsOfExperience=Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getYearsOfExperience,
                        Collectors.mapping(Instructor::getName,Collectors.toList())));
        mapYearsOfExperience.forEach((key,value)->{
            System.out.println("key = " + key+"value = "+value);
        });

    }
}
