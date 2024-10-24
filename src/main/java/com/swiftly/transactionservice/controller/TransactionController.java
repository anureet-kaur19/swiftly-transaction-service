package com.swiftly.transactionservice.controller;

import java.util.List;

import com.swiftly.transactionservice.dto.TransactionDto;
import com.swiftly.transactionservice.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    // GET /transactions
    @GetMapping
    public ResponseEntity<List<TransactionDto>> getAllTransactions() {
        List<TransactionDto> transactions = transactionService.getAllTransactions();
        return ResponseEntity.ok(transactions);
    }

    // GET /transactions/{accountId}
    @GetMapping("/{accountId}")
    public ResponseEntity<List<TransactionDto>> getTransactionsByAccount(@PathVariable String accountId) {
        List<TransactionDto> transactions = transactionService.getTransactionsByAccount(accountId);
        return ResponseEntity.ok(transactions);
    }

    // GET /transactions/{userId}
    @GetMapping("/{userId}")
    public ResponseEntity<List<TransactionDto>> getTransactionsByUser(@PathVariable String userId) {
        List<TransactionDto> transactions = transactionService.getTransactionsByUser(userId);
        return ResponseEntity.ok(transactions);
    }

    // POST /transactions/create/{accountId}
    @PostMapping("/create/{accountId}")
    public ResponseEntity<TransactionDto> createTransaction(@PathVariable String accountId, @RequestBody TransactionDto transaction) {
        TransactionDto createdTransaction = transactionService.createTransaction(accountId, transaction);
        return ResponseEntity.ok(createdTransaction);
    }

    // GET /transactions/{transactionId}
    @GetMapping("/{transactionId}")
    public ResponseEntity<TransactionDto> getTransactionById(@PathVariable String transactionId) {
        TransactionDto transaction = transactionService.getTransactionById(transactionId);
        return ResponseEntity.ok(transaction);
    }

    // GET /transactions/{transactionId}/status
    @GetMapping("/{transactionId}/status")
    public ResponseEntity<String> getTransactionStatus(@PathVariable String transactionId) {
        String status = transactionService.getTransactionStatus(transactionId);
        return ResponseEntity.ok(status);
    }
}

