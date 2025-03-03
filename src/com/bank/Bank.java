package com.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Bank {

    private static final Logger logger = Logger.getLogger(Bank.class.getName());

    //List to store accounts
    private List<Account> accounts;

    //Constructor
    public Bank(){
        accounts = new ArrayList<>();
        logger.info("Bank initialized.");
    }

    //Methods to add an account
    public void addAccount(Account account) throws DuplicateAccountException{

        //Check if account number already exists
        if(findAccount(account.getAccNo()) != null){
            logger.warning("Duplicate account number:  " + account.getAccNo());
            throw new DuplicateAccountException("Account with number " + account.getAccNo() + " already exists.");
        }
        accounts.add(account);
        logger.info("Account added: " + account.getAccNo());
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
            logger.info("No accounts found.");
        }else{
            logger.info("Displaying all accounts.");
            for(Account account: accounts){
                System.out.println("Account Number: " + account.getAccNo() + ", Holder: " + account.getAccHolderName() + ", Balance: " + account.getBalance());
            }
        }
    }

    //Method to get the list of accounts
    public List<Account> getAccounts(){
        return accounts;
    }

}
