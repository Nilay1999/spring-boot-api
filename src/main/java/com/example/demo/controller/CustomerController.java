package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class CustomerController {
    
    @GetMapping(path = "/customer/{id}")
    public String getCustomerById(@PathVariable Integer id) {
        return "Hello" + id;
    }

}
