package com.restaurant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController  {
    @GetMapping("/")
    public String home() {
        return "FastFood API is running!";
    }
}