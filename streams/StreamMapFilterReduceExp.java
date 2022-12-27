package com.example.streams;

import com.example.functionalProgramming.Instructor;
import com.example.functionalProgramming.Instructors;

import java.util.stream.Collectors;

public class StreamMapFilterReduceExp {
    public static void main(String[] args) {
        //total years of exp. between instructors
        int result= Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .map(Instructor::getYearsOfExperience)
                .reduce(0,Integer::sum);
               // .reduce(0,(a,b)->a+b);
        System.out.println(result);
    }
}
