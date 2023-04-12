package com.example.bankly.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Account {


    @Id
    @SequenceGenerator(name = "account_sequence",
            sequenceName = "account_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "account_id")
    private Integer accountId;

    @Column(name = "opening_balance", nullable = false)
    private Integer openingBalance;

    @Column(name = "current_balance", nullable = false)
    private Integer currentBalance;

    @Column(name = "opening_date", nullable = false)
    private LocalDate openingDate;

    @Column(name = "account_type", nullable = false)
    private String accountType;

    @Column(name = "account_name", nullable = false)
    private String accountName;

    @Column(name = "account_number", nullable = false)
    private String accountNumber;

    @Column(name = "status", nullable = false)
    private String status;

//    @Column(name = "customer_id", nullable = false)
//    private String customerId;

}
