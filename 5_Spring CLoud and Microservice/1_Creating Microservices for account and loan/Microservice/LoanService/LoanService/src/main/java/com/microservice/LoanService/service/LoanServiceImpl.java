package com.microservice.LoanService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private com.microservice.LoanService.repository.LoanRepo repo;

    @Override
    public com.microservice.LoanService.model.Loan getLoanDetails(int id) {
        return repo.findById(id).orElse(null);
    }
}
