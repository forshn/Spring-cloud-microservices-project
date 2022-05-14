package com.forsh.fraud;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FraudCheckHistoryService {

    private final FraudCheckHistoryRepository repository;

    public FraudCheckHistoryService(FraudCheckHistoryRepository repository) {
        this.repository = repository;
    }

    public Boolean isFraudulentCustomer(Integer customerId) {
        repository.save(
                FraudCheckHistory
                        .builder()
                        .isFraudster(false)
                        .customerId(customerId)
                        .createdAt(LocalDateTime.now())
                        .build());

        return false;
    }
}
