package com.bridgelabz.Day11_12.Stock;

import java.util.Scanner;

public class Account {

    private double accountBalance;
    public  Account(double acc){
        this.accountBalance = acc;
    }
    public void credit(Scanner scr){
        System.out.println("Please Enter amount need to credit");
        accountBalance = scr.nextDouble();
    }

    public void debit(Scanner scr){
        System.out.println("Please Enter Amount to Debit");
        double debit = scr.nextDouble();
        if(debit > accountBalance){
            System.out.println("Insufficient Balance");
        }else{
            accountBalance = accountBalance-debit;
            System.out.println("Amount Debited :"+debit);
            System.out.println("Balance :"+accountBalance);
        }

    }

    public double accountBalance(){
        return accountBalance;
    }
}
