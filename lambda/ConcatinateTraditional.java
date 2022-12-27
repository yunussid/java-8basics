package com.example.lambda;

public class ConcatinateTraditional implements ConcatinateInterface{
    @Override
    public String sconcat(String a, String b) {
        return a+" "+b;
    }

    public static void main(String[] args) {
        ConcatinateTraditional concatinateTraditional=new ConcatinateTraditional();
        System.out.println(concatinateTraditional.sconcat("Hello","Yunus"));
    }

}
