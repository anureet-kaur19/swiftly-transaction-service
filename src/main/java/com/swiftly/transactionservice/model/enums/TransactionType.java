package com.swiftly.transactionservice.model.enums;

import lombok.Getter;

@Getter
public enum TransactionType {
    DEPOSIT("Deposit"),
    WITHDRAWAL("Withdrawal"),
    TRANSFER("Transfer");

    private final String transactionType;

    TransactionType(String transactionType) {this.transactionType = transactionType; }

}

