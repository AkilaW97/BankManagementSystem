package com.bank;

public class TransactionThread extends Thread{
    private Account account;
    private String transactionType;
    private double amount;

    //Constructor
    public TransactionThread(Account account, String transactionType, double amount){
        this.account = account;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    //Run method (executed when the thread starts)

    @Override
    public void run() {
        if(transactionType.equals("deposit")){
            account.deposit(amount);
        } else if (transactionType.equals("withdraw")) {
            account.withdraw(amount);
        }
    }
}
