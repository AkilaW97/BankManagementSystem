package com.bank;

public class Main {

    public static void main(String[] args) {

        //Create a bank
        Bank bank = new Bank();

        //create specialized accounts
        SavingsAccount savingsAccount = new SavingsAccount("123456", "Jhon Doe", 1000.00, 5.0);
        CurruntAccount curruntAccount = new CurruntAccount("678910", "Jane Doe", 2000.00, 500.00);

        //Duplicate account number
        try{
            //Add accounts to the bank
            bank.addAccount(savingsAccount);
            bank.addAccount(curruntAccount);
        } catch (DuplicateAccountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //Display all accounts
        bank.displayAllAccounts();

        //Test savings account features
        System.out.println("\nTesting Savings Account:");
        savingsAccount.deposit(500.00);
        savingsAccount.withdraw(200.00);
        //failed due to minimum balance
        savingsAccount.withdraw(1500.00);

        //Demonstrate polymorphism using InterestBearing  interface
        System.out.println("\nCalculating interest for interest-bearing accounts:");
        for(Account account: bank.getAccounts()){
            if(account instanceof InterestBearing){
                InterestBearing interestAccount = (InterestBearing) account;
                interestAccount.calculateInterest();
            }
        }

        //Test current account features
        System.out.println("\nTesting Current Account: ");
        curruntAccount.deposit(1000.00);
        //succeed - within overdraft limit
        curruntAccount.withdraw(3000.00);
        //failed - exceeds overdraft limit
        curruntAccount.withdraw(1000.00);
        
    }
}
