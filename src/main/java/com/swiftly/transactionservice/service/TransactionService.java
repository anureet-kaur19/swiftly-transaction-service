package com.swiftly.transactionservice.service;

import com.swiftly.transactionservice.dto.TransactionDto;
import java.util.List;

public interface TransactionService {

    List<TransactionDto> getAllTransactions();

    List<TransactionDto> getTransactionsByAccount(String accountId);

    List<TransactionDto> getTransactionsByUser(String userId);

    TransactionDto createTransaction(String accountId, TransactionDto transaction);

    TransactionDto getTransactionById(String transactionId);

    String getTransactionStatus(String transactionId);

}

