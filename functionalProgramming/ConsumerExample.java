package com.example.functionalProgramming;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer <String> c= (x) -> System.out.println(x.length()+" the value of x: "+x);
        c.accept("up in the sky");

        //consumer with block statement
        Consumer<Integer> d=(x) -> {
            System.out.println("x*x = " +x*x);
            System.out.println("x/x = "+x/x);
        };
        d.accept(10);
    }
}
