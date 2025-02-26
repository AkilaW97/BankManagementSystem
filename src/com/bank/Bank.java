package com.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    //List to store accounts
    private List<Account> accounts;

    //Constructor
    public Bank(){
        accounts = new ArrayList<>();
    }

    //Methods to add an account
    public void addAccount(Account account){
        accounts.add(account);
        System.out.println("Account added successfully");
    }

    //Methods to find an account by account number
    public Account findAccount(String accountNumber){
        for(Account account : accounts){
            if(account.getAccNo().equals(accountNumber)){
                return account;
            }
        }
        return null; //Return null if an account not found
    }

    //Methods to display all accounts
    public void displayAllAccounts(){
        if(accounts.isEmpty()){
            System.out.println("No accounts found");
        }else{
            System.out.println("List of all accounts");
            for(Account account: accounts){
                System.out.println("Account Number: " + account.getAccNo() + ", Holder: " + account.getAccHolderName() + ", Balance: " + account.getBalance());
            }
        }
    }

}
