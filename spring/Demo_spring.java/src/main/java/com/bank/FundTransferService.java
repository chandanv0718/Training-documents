package com.bank;

public class FundTransferService {

    public void transferFunds(String fromAccount, String toAccount, double amount) {

        System.out.println("Fund Transfer Started");
        System.out.println("From Account: " + fromAccount);
        System.out.println("To Account: " + toAccount);
        System.out.println("Amount: " + amount);
        System.out.println("Transfer Successful");
    }
}