package com.example.streams;

import com.example.functionalProgramming.Instructor;
import com.example.functionalProgramming.Instructors;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingMinMaxAvgExample {
    public static void main(String[] args) {
        //grouping the instructor in tow sets of online course vs not online and get max years of exp of instructor
        Map<Boolean, Optional<Instructor>> maxInstructor= Instructors.getAll()
                .stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.maxBy(Comparator.comparing
                                (Instructor::getYearsOfExperience))));
        maxInstructor.forEach((key,value)->{
            System.out.println("key = "+key+" value = "+value);
        });
        System.out.println("---------");

        //collectingAndThen
        Map<Boolean, Instructor> maxInstructor1= Instructors.getAll()
                .stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing
                                (Instructor::getYearsOfExperience)),
                                Optional::get)));
        maxInstructor1.forEach((key,value)->{
            System.out.println("key = "+key+" value = "+value);
        });
        System.out.println("-------------------");
        //average years of exp who teaches online or not
        Map<Boolean, Double> maxInstructor2= Instructors.getAll()
                .stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                                Collectors.averagingInt
                                        (Instructor::getYearsOfExperience)
                                ));
        maxInstructor2.forEach((key,value)->{
            System.out.println("key = "+key+" value = "+value);
        });
        System.out.println("--------------");
    //drive a statical summary of group by
        Map<Boolean, IntSummaryStatistics> maxInstructor3= Instructors.getAll()
                .stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.summarizingInt
                                (Instructor::getYearsOfExperience)
                ));
        maxInstructor3.forEach((key,value)->{
            System.out.println("key = "+key+" value = "+value);
        });
    }


}
