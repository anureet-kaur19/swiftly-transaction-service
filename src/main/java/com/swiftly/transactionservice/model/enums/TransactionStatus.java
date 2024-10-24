package com.swiftly.transactionservice.model.enums;

import lombok.Getter;

@Getter
public enum TransactionStatus {
    NEW("New"),
    PENDING("Pending"),
    COMPLETED("Completed"),
    FAILED("Failed");

    private final String transactionStatus;

    TransactionStatus(String transactionStatus) {this.transactionStatus = transactionStatus; }

}
