package com.lian.supplierandwholesalerlian.domain.api;

import com.lian.supplierandwholesalerlian.domain.model.DetailTransaction;

import java.util.List;

public interface IDetailTransactionServicePort {
    void saveDetailTransaction(DetailTransaction detailTransaction);

    List<DetailTransaction> getAllDetailTransaction();

    DetailTransaction getDetailTransaction(Long id);

    void updateDetailTransaction(DetailTransaction detailTransaction);

    void deleteDetailTransaction(Long id);
}
