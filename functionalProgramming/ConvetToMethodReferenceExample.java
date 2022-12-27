package com.example.functionalProgramming;

import java.util.function.Predicate;

public class ConvetToMethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p2=(i) ->i.getYearsOfExperience()>10;
        Predicate<Instructor> p1=ConvetToMethodReferenceExample::greaterThanTenYearsOfExperience;

        Instructors.getAll().forEach(instructor -> {
            if (p2.test(instructor)){
                System.out.println(instructor);
            }
        });
    }
    public static boolean greaterThanTenYearsOfExperience(Instructor instructor){
        if(instructor.getYearsOfExperience()>10){
            return true;
        }
        return false;
    }
}
