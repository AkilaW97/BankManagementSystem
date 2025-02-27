package com.bank;

public class CurruntAccount extends Account {
    private double overdraftLimit;

    //Constructor
    public CurruntAccount(String accNo, String accHolderName, double balance, double overdraftLimit ){
        super(accNo, accHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    //Getters for overdraft limit
    public double getOverdraftLimit(){
        return overdraftLimit;
    }

    //Override the withdrawal method to allow overdraft

    @Override
    public void withdraw(double amount) {
        if(amount > 0 && (getBalance() - amount) >= - overdraftLimit){
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful. New balance: " + getBalance());
        }else {
            System.out.println("Withdrawal failed. Overdraft limit exceeded.");
        }
    }
}
