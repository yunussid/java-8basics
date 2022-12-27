package com.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SumOfNumbersUsingCallable {
    //will give array of number from 0 to 5000 in array
    public static int[] array= IntStream.rangeClosed(0,5000).toArray();
    //total is sum method provided by int stream
    public  static int total = IntStream.rangeClosed(0,5000).sum();

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        //callable thread sum from 0 to 2500
        Callable callable1=() ->{
            int sum=0;
            for(int i=0;i< array.length/2;i++){
                sum+=array[i];
            }
            return sum;
        };
        //callable thread from 2500 to 5000
        Callable callable2=() ->{
            int sum=0;
            for(int i= array.length/2;i<array.length;i++){
                sum+=array[i];
            }
            return sum;
        };

        //new fixed thread pool of 2 threads
        ExecutorService executorService= Executors.newFixedThreadPool(2);
       //task list contains callable like callable 1 and callable 2
        List<Callable<Integer>> taskList= Arrays.asList(callable1,callable2);
        //providing tasklist to executor Service and invokeall will directly invoke both callable
        List<Future<Integer>> results=executorService.invokeAll(taskList);

        int k=0;
        int sum=0;
        //adding result to sum variable
        for (Future<Integer> result:results){
            sum+=result.get();
            //print first and then second result
            System.out.println("Sum of "+ ++k +" is: "+ result.get());
        }
        System.out.println("Sum from the callable is: " +sum);
        //sum of both callable
        System.out.println("Correct sum from InStream is: "+total);
        //shuting down executor service
        executorService.shutdown();
    }
}
