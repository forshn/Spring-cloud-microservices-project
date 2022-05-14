package com.forsh.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Customer {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
