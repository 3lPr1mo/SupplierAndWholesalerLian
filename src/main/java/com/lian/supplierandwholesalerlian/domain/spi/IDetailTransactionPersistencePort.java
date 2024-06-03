package com.lian.supplierandwholesalerlian.domain.spi;

import com.lian.supplierandwholesalerlian.domain.model.DetailTransaction;

import java.util.List;

public interface IDetailTransactionPersistencePort {
    void saveDetailTransaction(DetailTransaction detailTransaction);

    List<DetailTransaction> getAllDetailTransaction();

    DetailTransaction getDetailTransaction(Long id);

    void updateDetailTransaction(DetailTransaction detailTransaction);

    void deleteDetailTransaction(Long id);
}
