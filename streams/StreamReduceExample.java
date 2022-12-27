package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9);
        int results =numbers.stream()
                //identiy operatprgives first aelement and
                //0+1=1     //10+5=15    //36+9=45
                //1+2=3     //15+6=21
                //3+3=6     //21+7=28
                //6+4=10    //28+8=36

                .reduce(0,(a,b)->a+b);
        System.out.println(results);

        int result1=numbers.stream().reduce(1,(a,b)->a*b);
        System.out.println(result1) ;

        Optional result2=numbers.stream().reduce((a, b)->a+b);
        System.out.println(result2.get());
    }
}
