package com.lian.supplierandwholesalerlian.domain.api;

import com.lian.supplierandwholesalerlian.domain.model.Transaction;

import java.util.List;

public interface ITransactionServicePort {
    void saveTransaction(Transaction transaction);

    List<Transaction> getAllTransaction();

    Transaction getTransaction(Long transactionId);

    void updateTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);
}
