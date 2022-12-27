package com.example.lambda;

public class HelloWorldTraditionalWay implements HelloWorlfInterface{
    @Override
    public  String sayHelloWorld(){
        return  "Hello";
    }

    public static void main(String[] args){
        HelloWorldTraditionalWay hellWorldTraditional=new HelloWorldTraditionalWay();
        System.out.println(hellWorldTraditional.sayHelloWorld());
    }
}
