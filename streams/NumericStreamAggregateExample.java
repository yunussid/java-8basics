package com.example.streams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        //sum
        int sum= IntStream.rangeClosed(0,1000).sum();
        System.out.println("sum of 1000 num is: "+sum);

        //min
        OptionalInt min =IntStream.rangeClosed(0,1000).min();
        System.out.println("Minimum of 1000 num is: "+min.getAsInt());

        //max
        OptionalInt max=IntStream.rangeClosed(0,1000).max();
        System.out.println("Max of 1000 num is: "+max.getAsInt());

        //average
        OptionalDouble avg= LongStream.rangeClosed(0,1000).asDoubleStream().average();
        System.out.println("average is: "+(avg.isPresent()?avg.getAsDouble():0.0));
    }
}
