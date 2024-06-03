package com.lian.supplierandwholesalerlian.domain.api;

import com.lian.supplierandwholesalerlian.domain.model.Paid;

import java.util.List;

public interface IPaidServicePort {
    void savePaid(Paid paid);

    List<Paid> getAllPaid();

    Paid getPaid(Long paidId);

    void updatePaid(Paid paid);

    void deletePaid(Long paidId);
}
