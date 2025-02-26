package com.bank;

public class Account {

    //Attributes
    private String AccNo;
    private String AccHolderName;
    private Double balance;

    //Constructors
    public Account(String AccNo, String AccHolderName, Double balance){
        this.AccNo = AccNo;
        this.AccHolderName = AccHolderName;
        this.balance = balance;
    }

    //Getters and setters
    public String getAccNo() {
        return AccNo;
    }

    public String getAccHolderName() {
        return AccHolderName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    //Deposit method
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        }else {
            System.out.println("Invalid deposit amount");
        }
    }

    //withdraw method
    public void withdraw(double amount){
        if(amount > 0){
            if(balance >= amount){
                balance -=amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            }else{
                System.out.println("Insufficient Balance. Current balance: " + balance);
            }
        }else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

}
