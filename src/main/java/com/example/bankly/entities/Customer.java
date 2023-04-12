package com.example.bankly.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Table(name = "customers")
public class Customer {

    @Id
    @SequenceGenerator(name = "customer_sequence",
                        sequenceName = "customer_sequence",
                        allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "primary_phone", nullable = false)
    private String primaryPhone;

    @Column(name = "primary_email", nullable = false)
    private String primaryEmail;


    @Column(name = "password", nullable = false)
    private String password;


    public Customer(String customerId) {
    }

    public Customer(String firstName, String lastName,
                    String middleName, LocalDate dateOfBirth, String primaryPhone,
                    String primaryEmail, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.primaryPhone = primaryPhone;
        this.primaryEmail = primaryEmail;
        this.password = password;
    }
}
