package com.example.functionalProgramming;

import java.util.Arrays;
import java.util.List;

public class Instructors {
    public static List<Instructor> getAll(){
        Instructor instructor1=new Instructor("Yunus",2,"Developer","M",true, Arrays.asList("Java Programming","C++ Programming"));
        Instructor instructor2=new Instructor("Jenny",7,"Senior Developer","F",true, Arrays.asList("Unit Testing","CI/CD"));
        Instructor instructor3=new Instructor("Amit",1,"Jr Developer","M",false, Arrays.asList("ReactJS","DBMS"));
        Instructor instructor4=new Instructor("Ajeet",1,"Jr Developer","M",true, Arrays.asList("Mern Stack","OS"));
        Instructor instructor5=new Instructor("Nitish",12,"CTO","M",true, Arrays.asList("C#","System Design"));

        List<Instructor> list=Arrays.asList(instructor1,instructor2,instructor3,instructor4,instructor5);
        return list;

    }
}
