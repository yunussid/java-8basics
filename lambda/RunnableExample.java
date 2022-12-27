package com.example.lambda;

public class RunnableExample {
    public static void main(String[] args) {
        //Runnable tRADITIONAL EXP
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                int sum=0;
                for(int i=0;i<10;i++){
                    sum+=i;
                }
                System.out.println("Traditional: "+sum);
            }
        };
        new Thread((runnable)).start();;

        //Implement Using Lambda
        Runnable runnable1=()->{
            int sum=0;
            for(int i=0;i<10;i++)
                sum+=i;
            System.out.println("Lambda "+sum);
        };
        new Thread((runnable1)).start();

        //Implements Using Thread With Lambda
        new Thread( () -> {
            int sum=0;
            for(int i=0;i<10;i++){
                sum+=i;
            }
            System.out.println("Thread Lambda "+sum);
        }).start();
    }
}
