package com.forsh.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(
        CustomerRepository customerRepository
) {

    public void registerCustomer(CustomerRequest customerRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRequest.getFirstName())
                .lastName(customerRequest.getLastName())
                .email(customerRequest.getEmail()).build();

        customerRepository.save(customer);
    }
}
