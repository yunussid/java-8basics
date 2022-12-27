package com.example.lambda;

public class helloWorldLambda {
    public static void main(String[] args) {
        //implemeting say hello world using lambda
        HelloWorlfInterface helloWorlfInterface = () -> {
            return "Hello World";
        };
        HelloWorlfInterface helloWorlfInterfaceA = () ->"Hello World";

        System.out.println(helloWorlfInterface.sayHelloWorld());
    }
}
