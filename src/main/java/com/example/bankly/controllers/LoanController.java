package com.example.bankly.controllers;

import com.example.bankly.entities.Loan;
import com.example.bankly.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

    public final LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }
    @GetMapping
    public List<Loan> getAllLoans() {
        return loanService.getAllLoans();
    }
    @GetMapping("/{accountNumber}")
    public ResponseEntity<?> getLoanByAccountNumber(@PathVariable("accountNumber") String accountNumber) {
        return new ResponseEntity<>(loanService.getLoanByAccountNumber(accountNumber), HttpStatus.OK);
    }
//    public Optional<Loan> getLoanByAccountNumber(@PathVariable("accountNumber") String accountNumber) {
//        return loanService.getLoanByAccountNumber(accountNumber);
//    }
}
