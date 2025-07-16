package com.microservice.LoanService.controller;

import com.microservice.LoanService.model.Loan;
import com.microservice.LoanService.service.LoanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Loan")
public class LoanController {

    @Autowired
    private LoanServiceImpl service;

    @GetMapping("/greet")
    public String greet(){
        return "Hello";
    }

    @GetMapping("/loandetails/{id}")
    public Loan getLoanDetails(@PathVariable int id){
        return service.getLoanDetails(id);
    }
}
