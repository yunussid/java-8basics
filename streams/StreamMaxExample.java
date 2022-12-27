package com.example.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8);
        //calc max using stream max function
        Optional res=numbers.stream().max(Integer::compareTo);
        if (res.isPresent())
            System.out.println(res.get());

        //max using reduce
        int res2=numbers.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println(res2);

        Optional res3=numbers.stream().reduce((a,b)->a>b?a:b);
        if (res3.isPresent())
            System.out.println(res3.get());

        Optional res4=numbers.stream().reduce(Integer::sum);
        if (res4.isPresent())
            System.out.println(res4.get());
    }
}
