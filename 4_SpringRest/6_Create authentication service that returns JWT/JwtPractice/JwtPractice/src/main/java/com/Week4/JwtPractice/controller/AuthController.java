package com.Week4.JwtPractice.controller;

import com.Week4.JwtPractice.model.AuthRequest;
import com.Week4.JwtPractice.util.JwtGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private JwtGenerator jwtgenerator;

    // In real apps, you should validate from database
    private final String hardCodedUsername = "Arghya";
    private final String hardCodedPassword = "MeowMeow1000";

    @PostMapping("/login")
    public ResponseEntity<String> authenticateUser(@RequestBody AuthRequest authRequest) {
        if (hardCodedUsername.equals(authRequest.getUsername()) &&
                hardCodedPassword.equals(authRequest.getPassword())) {

            String token = jwtgenerator.generateToken(authRequest.getUsername());
            return ResponseEntity.ok(token);
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}

