package com.lian.supplierandwholesalerlian.domain.spi;

import com.lian.supplierandwholesalerlian.domain.model.Transaction;

import java.util.List;

public interface ITransactionPersistencePort {
    void saveTransaction(Transaction transaction);

    List<Transaction> getAllTransaction();

    Transaction getTransaction(Long transactionId);

    void updateTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);
}
