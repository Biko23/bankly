package com.example.bankly.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
@Table(name = "loans")
public class Loan {


    @Id
    @SequenceGenerator(name = "loan_sequence",
            sequenceName = "loan_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "loan_id")
    private Integer loanId;

    @Column(name = "principle")
    private Integer principle;

    @Column(name = "interest")
    private Integer interest;

    @Column(name = "outstanding_balance")
    private Integer outstandingBalance;

    @Column(name = "disbursement_date")
    private LocalDate disbursementDate;

    @Column(name = "status")
    private String status;

//    @Column(name = "account_id")
//    private Integer accountId;
//
    @Column(name = "account_number")
    private String accountNumber;
//
//    @Column(name = "funding_account_number")
//    private String fundingAccountNumber;


    public Loan() {
    }

    public Loan(Integer loanId, Integer principle, Integer interest,
                Integer outstandingBalance, LocalDate disbursementDate,
                String status, String accountNumber) {
        this.loanId = loanId;
        this.principle = principle;
        this.interest = interest;
        this.outstandingBalance = outstandingBalance;
        this.disbursementDate = disbursementDate;
        this.status = status;
        this.accountNumber = accountNumber;
    }
}
