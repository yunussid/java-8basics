package com.example.functionalProgramming.realExample;

import com.example.functionalProgramming.BiPredicateExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BankTransfer {
    public static void main(String[] args) {
        //Factory Instance of bankaccount
        AccountFactory accountFactory = BankAccount::new;
        //using constructor reference studentbankaccount and universitybankaccount using accountfactory
        BankAccount studentBankAccount = accountFactory.getBankAccount(1, 50000, "Student A");
        BankAccount universityBankAccount = accountFactory.getBankAccount(2, 100000, "University");

        //amount withdrawing greater than balanace
        BiPredicate<Double, Double> p1 = (balance, amount) -> balance > amount;
        //biconsumer used as printer
        BiConsumer<String, Double> printer = (x, y) -> System.out.println(x + y);
        BiConsumer<BankAccount, BankAccount> printer2 = (student, university) -> {
            System.out.println("Ending balance of student account: " + studentBankAccount.getBalance() +
                    "University account: " + universityBankAccount.getBalance());

        };
        ExecutorService service = Executors.newFixedThreadPool(10);

        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " says::Executing Transfer");
            try {
                //deducting 1000 from student bank account
                double amount = 1000;
                //checking if student bank account has balance greater than the amount
                if (!p1.test(studentBankAccount.getBalance(), amount)) {
                    //if balance less printing out message
                    printer.accept(Thread.currentThread().getName() + "says:: balance insufficient ,", amount);
                    return;
                }
                //while transfer is not successful we continue and sleep for 100ms
                while (!studentBankAccount.transfer(universityBankAccount, amount)) {
                    TimeUnit.MILLISECONDS.sleep(100);
                    continue;
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            //if transfer is successful putting message transfer is successful
            printer.accept(Thread.currentThread().getName() + "says transfer is successful: Balance in account", universityBankAccount.getBalance());
        });
        for (int i = 0; i < 20; i++) {
            service.submit(t1);
        }
        //shutting down service within 24h
        service.shutdown();
        //if service is not shutdown we shut it down in 24 h
        try {

            while (!service.awaitTermination(24L, TimeUnit.HOURS)) {
                System.out.println("Not yet.Still waiting for termination");
            }

        } catch (InterruptedException iee) {
            iee.printStackTrace();
        }
        printer2.accept(studentBankAccount, universityBankAccount);
    }
}
