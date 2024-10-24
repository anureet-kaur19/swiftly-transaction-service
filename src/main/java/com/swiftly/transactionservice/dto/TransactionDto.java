package com.swiftly.transactionservice.dto;

import com.swiftly.transactionservice.model.enums.TransactionStatus;
import com.swiftly.transactionservice.model.enums.TransactionType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class TransactionDto {
    @NotBlank
    private Long transactionId;

    @NotBlank
    private String accountId;

    @NotBlank
    private TransactionType transactionType;

    @NotBlank
    private BigDecimal amount;

    @NotBlank
    private LocalDateTime transactionDate;

    @NotBlank
    private TransactionStatus status;

}
