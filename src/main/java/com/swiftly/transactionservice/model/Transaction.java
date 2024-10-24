package com.swiftly.transactionservice.model;

import com.swiftly.transactionservice.model.enums.TransactionStatus;
import com.swiftly.transactionservice.model.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @Column(name = "account_id", nullable = false)
    private String accountId;

    @Column(name = "transaction_type", nullable = false)
    private TransactionType transactionType; // e.g., "DEPOSIT", "WITHDRAWAL", "TRANSFER"

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "transaction_date", nullable = false)
    private LocalDateTime transactionDate;

    @Column(name = "status", nullable = false)
    private TransactionStatus status; // e.g., "PENDING", "COMPLETED", "FAILED"

}

