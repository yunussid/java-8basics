package com.example.lambda;

public class ConcatinateLambda {
    public static void main(String[] args) {
        ConcatinateInterface concatinateInterface =(a,b)->a+" "+b;
        System.out.println(concatinateInterface.sconcat("Hello","Yunus"));
    }
}
