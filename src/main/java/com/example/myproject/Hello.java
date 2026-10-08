package com.example.myproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String sayHello() {
        return "Привет, мир!";
    }

    @GetMapping("/number")
    public int getNumber() {
        return 42;
    }
}