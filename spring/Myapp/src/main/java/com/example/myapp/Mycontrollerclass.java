package com.example.myapp;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usersApi")
public class Mycontrollerclass {

    private List<String> users =
            List.of("Chandan", "Ravi", "Nithin", "Hemanth");

    @GetMapping
    public List<String> getUsers() {
        return users;
    }
}
