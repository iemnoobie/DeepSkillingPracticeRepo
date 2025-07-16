package com.microservice.LoanService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepo extends JpaRepository<com.microservice.LoanService.model.Loan, Integer> {
}
