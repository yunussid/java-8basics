package com.example.functionalProgramming;

import java.util.Arrays;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        InstructorFactory instructorFactory=Instructor::new;
        Instructor instructor=instructorFactory.getInstructor("Nitish",12,"CTO","M",true, Arrays.asList("C#"," System Design"));

        System.out.println(instructor);
    }
}
