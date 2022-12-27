package com.example.functionalProgramming;

import java.util.Locale;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer,Double> sqrt=n-> Math.sqrt(n);
        System.out.println("Square root of 64: "+ sqrt.apply(64));
        System.out.println("Square root of 81: "+sqrt.apply(81));

        Function<String,String> lowercaseFunction=(s)->s.toLowerCase();
        System.out.println(lowercaseFunction.apply("PROGRAMMING"));

        Function<String,String> conatFunction=(s)->s.concat("In Java");

        System.out.println(lowercaseFunction.andThen(conatFunction).apply("PROGRAMMING "));
        System.out.println(lowercaseFunction.compose(conatFunction).apply("PROGRAMMING "));


    }
}
