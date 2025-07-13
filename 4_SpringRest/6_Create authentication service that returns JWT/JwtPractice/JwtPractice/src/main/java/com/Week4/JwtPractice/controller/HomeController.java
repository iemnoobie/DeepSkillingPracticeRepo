package com.Week4.JwtPractice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Hello this is a greeting message on a demo web app which i intend to secure using spring security";
    }
}
