package com.example.welcomeapp;

public class Student {

    private int id = 101;
    private String name = "Chandan";

    public void display() {
        System.out.println("Student Id: " + id);
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.display();
    }
}
