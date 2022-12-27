package com.example.lambda;

public class IncrementByFiveLambda {
    public static void main(String[] args) {
        isIncrementByFiveInterface incrementByFiveInterface=(x)->x+5;
        System.out.println(incrementByFiveInterface.incrementByFive(2));
    }
}
