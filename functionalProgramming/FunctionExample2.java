package com.example.functionalProgramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample2 {
    public static void main(String[] args) {
        //predicate will return true if instructtor has online courses
        Predicate<Instructor>  p1=(i)->i.isOnlineCourses();
        //Map of instructor with name and years of experience
        //Function which will input List<Instructor> and return a map<String,Integer>
        Function<List<Instructor>, Map<String,Integer>> mapFunction=(instructors -> {
            Map<String,Integer> map=new HashMap<>();
            //looping through instructor and taking name as key and years of exp as value
            instructors.forEach(instructor -> {
                if(p1.test(instructor))
                     map.put(instructor.getName(),instructor.getYearsOfExperience());
            });
            return map;
        });
        System.out.println(mapFunction.apply(Instructors.getAll()));
    }
}
