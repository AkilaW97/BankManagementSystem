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

}
