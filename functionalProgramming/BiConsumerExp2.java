package com.example.functionalProgramming;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExp2 {
    public static void main(String[] args) {
        List<Instructor> instructors=Instructors.getAll();
        //print name and gender of instructor
        BiConsumer<String,String> biConsumer=(name, gender) -> System.out.println("name is: "+name+" and gender is: "+gender);
        instructors.forEach(instructor -> biConsumer.accept(instructor.getName(),instructor.getGender()));

        //print out name and list of courses
        BiConsumer<String,List<String>> biConsumer1=(name,courses)-> System.out.println("name is: "+name+" courses is: "+courses);

        instructors.forEach(instructor -> biConsumer1.accept(instructor.getName(),instructor.getCourses()));

        //print out name and gender who teaches online
        System.out.println("-----------");
        instructors.forEach(instructor -> {
            if (instructor.isOnlineCourses())
                biConsumer.accept(instructor.getName(), instructor.getGender());
        });
    }
}
