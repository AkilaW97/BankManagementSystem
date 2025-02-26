package com.bank;

public class Main {

    public static void main(String[] args) {

        //create an account
        Account acc = new Account("123456", "Jhon Doe", 1000.00);

        //Test the deposit amount
        acc.deposit(500.00); //Valid
        acc.deposit(-100.00); //Invalid

        //Test the withdrawal method
        acc.withdraw(200.00); //Valid
        acc.withdraw(2000.00); //Insufficient
        acc.withdraw(-100.00); //Invalid
    }
}
