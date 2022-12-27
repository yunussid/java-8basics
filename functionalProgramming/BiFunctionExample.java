package com.example.functionalProgramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    public static void main(String[] args) {
        //BiFunction 2 inputs List<Instructor> and second is predicate which will filter if instructor has online courses and return map of string and int where string is name and int is years of exp

        Predicate<Instructor> p1=(i)-> i.isOnlineCourses()==true;
        BiFunction<List<Instructor>,Predicate<Instructor>, Map<String,Integer>> mapBiFunction=
                ((instructors, instructorPredicate) -> {
                  Map<String,Integer> map= new HashMap<>();
                  instructors.forEach(instructor -> {
                        if(instructorPredicate.test(instructor)){
                            map.put(instructor.getName(),instructor.getYearsOfExperience());

                        }
                  });
                  return map;
                });
        System.out.println(mapBiFunction.apply((Instructors.getAll()),p1));
    }
}
