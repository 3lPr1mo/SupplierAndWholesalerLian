package com.lian.supplierandwholesalerlian.domain.useCase;

import com.lian.supplierandwholesalerlian.domain.api.ITransactionServicePort;
import com.lian.supplierandwholesalerlian.domain.model.Transaction;
import com.lian.supplierandwholesalerlian.domain.spi.ITransactionPersistencePort;

import java.util.List;

public class TransactionUseCase implements ITransactionServicePort {

    private final ITransactionPersistencePort transactionPersistencePort;

    public TransactionUseCase(ITransactionPersistencePort transactionPersistencePort) {
        this.transactionPersistencePort = transactionPersistencePort;
    }

    @Override
    public void saveTransaction(Transaction transaction) {
        transactionPersistencePort.saveTransaction(transaction);
    }

    @Override
    public List<Transaction> getAllTransaction() {
        return transactionPersistencePort.getAllTransaction();
    }

    @Override
    public Transaction getTransaction(Long transactionId) {
        return transactionPersistencePort.getTransaction(transactionId);
    }

    @Override
    public void updateTransaction(Transaction transaction) {
        transactionPersistencePort.updateTransaction(transaction);
    }

    @Override
    public void deleteTransaction(Long transactionId) {
        transactionPersistencePort.deleteTransaction(transactionId);
    }
}
