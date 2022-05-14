package com.forsh.customer;

import lombok.Data;

@Data
public record CustomerRequest(String firstName,
                              String lastName,
                              String email) {
}
