package com.example.functionalProgramming;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        //printing out 2 numbers
        BiConsumer<Integer,Integer> biConsumer=(x,y) -> System.out.println("x: "+x+" y: "+y);
        biConsumer.accept(2,4);
        //calculating sumof 2 integer
        BiConsumer<Integer,Integer> biConsumer1=(x,y)-> System.out.println("x+y: "+(x+y));
        biConsumer1.accept(2,4);
        //concat string
        BiConsumer<String,String> biConsumer2=(x,y)-> System.out.println("x+y: "+(x+y));
        biConsumer2.accept("Fell on","deaf ears");

    }
}
