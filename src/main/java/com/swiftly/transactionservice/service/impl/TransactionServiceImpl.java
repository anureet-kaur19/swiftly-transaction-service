package com.swiftly.transactionservice.service.impl;

import com.swiftly.transactionservice.dto.TransactionDto;
import com.swiftly.transactionservice.service.TransactionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Override
    public List<TransactionDto> getAllTransactions() {
        return null;
    }

    @Override
    public List<TransactionDto> getTransactionsByAccount(String accountId) {
        return null;
    }

    @Override
    public List<TransactionDto> getTransactionsByUser(String userId) {
        return null;
    }

    @Override
    public TransactionDto createTransaction(String accountId, TransactionDto transaction) {
        return null;
    }

    @Override
    public TransactionDto getTransactionById(String transactionId) {
        return null;
    }

    @Override
    public String getTransactionStatus(String transactionId) {
        return null;
    }
}
