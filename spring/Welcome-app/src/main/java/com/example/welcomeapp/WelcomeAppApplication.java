package com.example.welcomeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WelcomeAppApplication {

    public static void main(String[] args) {

        System.out.println("Welcome to spring");

        ApplicationContext context =
                SpringApplication.run(WelcomeAppApplication.class, args);

        Student student = context.getBean(Student.class);

        student.display();
    }
}
