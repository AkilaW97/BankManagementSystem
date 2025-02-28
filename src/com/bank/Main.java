package com.bank;

public class Main {

    public static void main(String[] args) {

        //Create a bank
        Bank bank = new Bank();

        //create an account
        Account account = new Account("123456", "Aaron peries", 1000.00);


        //Duplicate account number
        try{
            //Add accounts to the bank
            bank.addAccount(account);
        } catch (DuplicateAccountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //Display all accounts
        bank.displayAllAccounts();

        //create multiple threads for concurrent transaction
        TransactionThread depositThread1 = new TransactionThread(account, "deposit", 500.00);
        TransactionThread depositThread2 = new TransactionThread(account, "deposit", 300.00);
        TransactionThread withdrawThread1 = new TransactionThread(account, "withdraw", 200.00);
        TransactionThread withdrawThread2 = new TransactionThread(account, "withdraw", 400.00);


       //Start the threads
        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();

        //Wait for all threads to finish
        try{
            depositThread1.join();
            depositThread2.join();
            withdrawThread1.join();
            withdrawThread2.join();
        }catch (InterruptedException e){
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        //Display the final balance
        System.out.println("Final balance: " + account.getBalance());

    }
}
