package com.example.streams;

import com.example.functionalProgramming.Instructor;
import com.example.functionalProgramming.Instructors;

import java.util.Optional;

public class StreamReduceExample2 {
    public static void main(String[] args) {
        //printing the name of the instructor who has the highest year of exp
        Optional instructors=Instructors.getAll().stream()
                .reduce((s1,s2)->{
                    if(s1.getYearsOfExperience()> s2.getYearsOfExperience())
                        return s1;
                    else
                        return s2;
                });
        if (instructors.isPresent())
            System.out.println(instructors.get());

        Optional instructors1=Instructors.getAll().stream()
                .reduce((s1,s2)->(s2.getYearsOfExperience()> s1.getYearsOfExperience())?s2:s1);
        System.out.println(instructors1.get());
    }
}
