package com.practiceOrmwithMySQL.JPAwithMySQL.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Hello, welcome to my Spring boot JPA with Mysql project";
    }
}
