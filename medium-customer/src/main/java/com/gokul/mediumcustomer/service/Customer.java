package com.gokul.mediumcustomer.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private Long customerId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
}