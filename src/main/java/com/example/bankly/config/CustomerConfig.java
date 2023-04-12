package com.example.bankly.config;

import com.example.bankly.entities.Customer;
import com.example.bankly.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner (CustomerRepository repository) {
        return args -> {
            Customer Biko=  new Customer(
                    "Biko",
                    "Biteete",
                    "Jeremy",
                    LocalDate.of(1988, 9, 23),
                    "+256789940343",
                    "biko@gmail.com",
                    "password"
            );
            Customer Dex =  new Customer(
                    "Lynda",
                    "Biteete",
                    "Kaitesi",
                    LocalDate.of(1987, 3, 7),
                    "+256701123456",
                    "dex@gmail.com",
                    "password"
            );
            repository.saveAll(List.of(Biko, Dex) );
        };
    }
}
