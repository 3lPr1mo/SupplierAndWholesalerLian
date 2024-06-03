package com.lian.supplierandwholesalerlian.domain.useCase;

import com.lian.supplierandwholesalerlian.domain.api.IDetailTransactionServicePort;
import com.lian.supplierandwholesalerlian.domain.model.DetailTransaction;
import com.lian.supplierandwholesalerlian.domain.spi.IDetailTransactionPersistencePort;

import java.util.List;

public class DetailTransactionUseCase implements IDetailTransactionServicePort {

    private final IDetailTransactionPersistencePort detailTransactionPersistencePort;

    public DetailTransactionUseCase(IDetailTransactionPersistencePort detailTransactionPersistencePort) {
        this.detailTransactionPersistencePort = detailTransactionPersistencePort;
    }

    @Override
    public void saveDetailTransaction(DetailTransaction detailTransaction) {
        detailTransactionPersistencePort.saveDetailTransaction(detailTransaction);
    }

    @Override
    public List<DetailTransaction> getAllDetailTransaction() {
        return detailTransactionPersistencePort.getAllDetailTransaction();
    }

    @Override
    public DetailTransaction getDetailTransaction(Long id) {
        return detailTransactionPersistencePort.getDetailTransaction(id);
    }

    @Override
    public void updateDetailTransaction(DetailTransaction detailTransaction) {
        detailTransactionPersistencePort.updateDetailTransaction(detailTransaction);
    }

    @Override
    public void deleteDetailTransaction(Long id) {
        detailTransactionPersistencePort.deleteDetailTransaction(id);
    }
}
