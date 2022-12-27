package com.example.streams;

import com.example.functionalProgramming.Instructor;
import com.example.functionalProgramming.Instructors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample3 {
    public static void main(String[] args) {
        //grouping by length of string and also checking nae containes e
        List<String> names=List.of("Sid","Mike","Jenny","Gene","Rajeev");
        LinkedHashMap<Integer,List<String>> result=names.stream()
                .collect(Collectors.groupingBy(String::length ,LinkedHashMap::new,Collectors
                        .filtering(s -> s.contains("e"),Collectors.toList())));
        System.out.println("result = " + result);

        System.out.println("-----------");
        //instructor grouping them by Senior >3 and Junior<3 and filter them on online course
        LinkedHashMap<String,List<Instructor>> instructorByExpAndOnline= Instructors.getAll()
                .stream().collect(Collectors.groupingBy(instructor ->
                                instructor.getYearsOfExperience()>3 ?"Senior":"Junior",
                        LinkedHashMap::new,Collectors.filtering(s->s.isOnlineCourses(),
                                Collectors.toList())));

        instructorByExpAndOnline.forEach((key,value)->{
            System.out.println("key = " + key +" value = "+value);
        });
    }
}

