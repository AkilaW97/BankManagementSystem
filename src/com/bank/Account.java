package com.bank;

import java.util.logging.Logger;

public class Account {

    private static final Logger logger = Logger.getLogger(Account.class.getName());

    //Attributes
    private String accNo;
    private String accHolderName;
    private Double balance;

    //Constructors
    public Account(String AccNo, String AccHolderName, Double balance){
        this.accNo = AccNo;
        this.accHolderName = AccHolderName;
        this.balance = balance;
        logger.info("Account created: " + accNo + " for " + accHolderName);
    }

    //Getters and setters
    public String getAccNo() {
        return accNo;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    //Deposit method
    public synchronized void deposit(double amount){
        if(amount > 0){
            balance += amount;
            logger.info("Deposit successful. Account: " + accNo + " Amount: " + amount + " New Balance: " + balance);
        }else {
            logger.warning("Invalid deposit amount. Account: " + accNo + " Amount: " + amount);
        }
    }

    //withdraw method
    public synchronized void withdraw(double amount){
        if(amount > 0){
            if(balance >= amount){
                balance -=amount;
                logger.info("Withdrawal successful. Account: " + accNo + " Amount: " + amount + " New Balance: " + balance);
            }else{
                logger.warning("Insufficient balance. Account: " + accNo + " Amount: " + amount + " Current Balance: " + balance);
            }
        }else {
            logger.warning("Invalid withdrawal amount. Account: " + accNo + " Amount: " + amount);
        }
    }

}
