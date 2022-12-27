package com.example.functionalProgramming.realExample;

public interface AccountFactory {
    public abstract BankAccount getBankAccount(int id,double balance,String accountName);

}
