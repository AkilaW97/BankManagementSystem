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

        savingsAccount.calculateInterest();

        //Test current account features
        System.out.println("\nTesting Current Account: ");
        curruntAccount.deposit(1000.00);
        //succeed - within overdraft limit
        curruntAccount.withdraw(3000.00);
        //failed - exceeds overdraft limit
        curruntAccount.withdraw(1000.00);

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
