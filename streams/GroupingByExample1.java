package com.example.streams;

import com.example.functionalProgramming.Instructor;
import com.example.functionalProgramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample1 {
    public static void main(String[] args) {
        //group list of names by there values
        List<String> names=List.of("Syed","Mike","Jenny","Gene","Rajeev");
        Map<Integer, List<String>> result=names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("result = " + result);

        System.out.println("-----------------");
        //grouping by instructors by their genders
        Map<String,List<Instructor>> instructorByGender= Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getGender));
        instructorByGender.forEach((key,value)->{
            System.out.println("key = "+key+" value = "+value);
        });
        //grouping by experience where >3years
        Map<String,List<Instructor>> instructorsByExp=Instructors.getAll().stream()
                .collect(Collectors.groupingBy(instructor ->
                    instructor.getYearsOfExperience()>2 ?"Senior":"Junior"
                ));
        instructorsByExp.forEach((key,value)->{
            System.out.println("key = "+key+" value ="+value);
        });
    }
}
