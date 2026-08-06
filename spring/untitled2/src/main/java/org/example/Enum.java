package org.example;
enum Status {
    SUCCESS,
}

public class Enum {

    public static void main(String[] args) {

        Status transaction = Status.SUCCESS;

        System.out.println("Transaction Status: " + transaction);
    }
}
