package com.microservice.AccountService.service;

import com.microservice.AccountService.model.Account;
import com.microservice.AccountService.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepo repo;

    @Override
    public Account getAccountDetails(int id) {
        return repo.findById(id).orElse(null);
    }
}
