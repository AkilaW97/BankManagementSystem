package com.bank;

public class Main {

    public static void main(String[] args) {

        //Create a bank
        Bank bank = new Bank();

        //create an account
        Account acc1 = new Account("123456", "Jhon Doe", 1000.00);
        Account acc2 = new Account("126456", "Jane Doe", 2000.00);
        Account acc3 = new Account("126456", "Aaron Doe", 3000.00);

        //Duplicate account number
        try{
            //Add accounts to the bank
            bank.addAccount(acc1);
            bank.addAccount(acc2);
            bank.addAccount(acc3);
        } catch (DuplicateAccountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //Display all accounts
        bank.displayAllAccounts();

       //Find an account by account number
        String searchAccountNumber = "123456";
        Account foundAccount = bank.findAccount(searchAccountNumber);
        if(foundAccount != null){
            System.out.println("Account found: " + foundAccount.getAccHolderName());
        }else {
            System.out.println("Account not found.");
        }

       //Test deposit and withdraw on a found account
        if(foundAccount != null){
            foundAccount.deposit(500.00);
            foundAccount.withdraw(200.00);
        }
    }
}
