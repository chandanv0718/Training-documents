package org.example;
public class BankingStringExample {

    public static void main(String[] args) {

        String customerName = " Chandan ";
        String accountType = "Savings Account";
        System.out.println("Length: " + customerName.length());
        System.out.println("Trim: " + customerName.trim());
        System.out.println("Upper Case: " + accountType.toUpperCase());
        System.out.println("Contains 'Savings': " + accountType.contains("Savings"));
        System.out.println("First Character: " + accountType.charAt(0));
    }
}
