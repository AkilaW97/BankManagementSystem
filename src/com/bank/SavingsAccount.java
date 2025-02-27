package com.bank;

public class SavingsAccount extends Account{

    private double interestRate;

    //Constructor
    public SavingsAccount(String accNo, String accHolderName, double balance, double interestRate) {
        //call the superclass constructor
        super(accNo, accHolderName, balance);
        this.interestRate = interestRate;
    }

    //Getters for interestRate
    public double getInterestRate(){
        return interestRate;
    }

    //Override the withdrawal method to enforce a minimum balance

    @Override
    public void withdraw(double amount) {
        //Minimum balance for savings account
        double minimumBalance = 100.0;
        if(amount > 0 && (getBalance() - amount) >= minimumBalance){
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful. New balance: " + getBalance());
        }else {
            System.out.println("Withdrawal failed. Minimum balance of " + minimumBalance + " must be maintained.");
        }
    }

    //Method to calculate interest
    public void calculateInterest(){
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest calculated and added. New balance: " + getBalance());
    }
}
