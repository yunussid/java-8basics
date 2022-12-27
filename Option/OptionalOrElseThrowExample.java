package com.example.Option;

import java.util.Optional;

public class OptionalOrElseThrowExample {
    public static void main(String[] args) throws Exception {
        //orElse
        Integer[] numbers=new Integer[10];
        numbers[0]=1;
        Optional<Integer> number=Optional.ofNullable(numbers[1]);
        int result=number.orElse(-1);
        System.out.println("result = " + result);

        //orElseGet
        result=number.orElseGet(()->-1);
        System.out.println("result -orElseGet = " + result);

        //orElseThrow
        try {
            result = number.orElseThrow(Exception::new);
            System.out.println("result or Else throw= " + result);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
