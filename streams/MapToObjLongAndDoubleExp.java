package com.example.streams;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MapToObjLongAndDoubleExp {
    public static void main(String[] args) {
        List<RandomIds> randomIdsList= IntStream.rangeClosed(0,5)
                .mapToObj((i)->{
                    return new RandomIds(i, ThreadLocalRandom.current().nextInt(100));
                }).collect(Collectors.toList());
        randomIdsList.forEach(System.out::println);
        System.out.println("-----------");

        LongStream longStream=IntStream.rangeClosed(0,5).mapToLong(i->(long) i);
        longStream.forEach(System.out::println);
        System.out.println("-----------");

        DoubleStream doubleStream=LongStream.rangeClosed(0,5).mapToDouble(i->(double) i);
        doubleStream.forEach(System.out::println);

    }
}
class RandomIds{
    int id;
    int randomNumbers;

    public RandomIds(int id, int randomNumbers) {
        this.id = id;
        this.randomNumbers = randomNumbers;
    }

    @Override
    public String toString() {
        return "RandomIds{" +
                "id=" + id +
                ", randomNumbers=" + randomNumbers +
                '}';
    }
}
