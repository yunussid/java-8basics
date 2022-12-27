package com.example.streams;

import com.example.functionalProgramming.Instructor;
import com.example.functionalProgramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitioningByExample {
    public static void main(String[] args) {
        //partition instructors in 2 groups of exp.
        //first is years of exp >3 and other is <=10
        Predicate<Instructor> experiencePredicate=instructor ->
                instructor.getYearsOfExperience()>3;
        Map<Boolean, List<Instructor>> partitionMap= Instructors.getAll()
                .stream().collect(Collectors.partitioningBy(experiencePredicate));

        partitionMap.forEach((key,value)->{
            System.out.println("key = " + key +" value = "+value);
        });
        System.out.println("---------------");

        //partition but return is set instead of list
        Map<Boolean, Set<Instructor>> partitionSet=Instructors.getAll()
                .stream().collect(Collectors.partitioningBy(experiencePredicate,
                        Collectors.toSet()));
        partitionSet.forEach((key,value)->{
            System.out.println("key = " + key+" value = " + value);
        });

    }
}
