package com.microservice.AccountService.controller;

import com.microservice.AccountService.model.Account;
import com.microservice.AccountService.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountServiceImpl service;

    @GetMapping("/greet")
    public String greet(){
        return "Hello";
    }

    @GetMapping("/accountdetails/{id}")
    public Account getAccountDetails(@PathVariable int id){
        return service.getAccountDetails(id);
    }
}
