package com.example.bankly.services;

import com.example.bankly.entities.Loan;
import com.example.bankly.repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {

    private LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    @Autowired

    public List<Loan> getAllLoans () {
        return loanRepository.findAll();
    }
    public Optional<Loan> getLoanByAccountNumber(String accountNumber) {
        Optional<Loan> customerLoan = loanRepository.findLoanByAccountNumber(accountNumber);
        if (customerLoan.isPresent()) {
            return customerLoan;
        }
        else throw new IllegalStateException("No Loan with that account Number");

    }
}
