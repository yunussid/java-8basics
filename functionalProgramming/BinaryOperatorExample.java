package com.example.functionalProgramming;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator=(a,b)->a+b;
        System.out.println(binaryOperator.apply(2,4));

        Comparator<Integer> comparator=(a,b) ->a.compareTo(b);
        BinaryOperator<Integer> maxBi=BinaryOperator.maxBy(comparator);
        System.out.println(maxBi.apply(7,8));

        BinaryOperator<Integer> minBy=BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(7,8));

        IntBinaryOperator intBinaryOperator=(a,b)->a*b;
        System.out.println(intBinaryOperator.applyAsInt(3,8));

        LongBinaryOperator longBinaryOperator=(a,b)->a*b;
        System.out.println(longBinaryOperator.applyAsLong(2000000l,345678l));

        DoubleBinaryOperator doubleBinaryOperator=(a,b)-> a*b;
        System.out.println(doubleBinaryOperator.applyAsDouble(234.5678,45678.678));
    }
}
