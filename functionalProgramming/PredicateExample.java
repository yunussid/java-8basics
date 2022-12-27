package com.example.functionalProgramming;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //if number is >10 return true else false
        Predicate<Integer> p1=(a)-> a>10;
        System.out.println(p1.test(11));

        //if i>10 and number is even
        Predicate<Integer> p2=(i)->i%2==0;
        System.out.println(p1.and(p2).test(20));

        //i>10 or number is even number
        System.out.println(p1.or(p2).test(4));

        //i>0 && i%2 !=0
        System.out.println(p1.and(p2.negate()).test(33));
    }
}
