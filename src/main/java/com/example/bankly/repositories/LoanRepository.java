package com.example.bankly.repositories;

import com.example.bankly.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {

//    @Query("SELECT a FROM Loan WHERE a.account_number = ?1")
    Optional<Loan> findLoanByAccountNumber(String accountNumber);
}
