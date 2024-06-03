package com.lian.supplierandwholesalerlian.domain.useCase;

import com.lian.supplierandwholesalerlian.domain.api.IPaidServicePort;
import com.lian.supplierandwholesalerlian.domain.model.Paid;
import com.lian.supplierandwholesalerlian.domain.spi.IPaidPersistencePort;

import java.util.List;

public class PaidUseCase implements IPaidServicePort {

    private final IPaidPersistencePort paidPersistencePort;

    public PaidUseCase(IPaidPersistencePort paidPersistencePort) {
        this.paidPersistencePort = paidPersistencePort;
    }

    @Override
    public void savePaid(Paid paid) {
        paidPersistencePort.savePaid(paid);
    }

    @Override
    public List<Paid> getAllPaid() {
        return paidPersistencePort.getAllPaid();
    }

    @Override
    public Paid getPaid(Long paidId) {
        return paidPersistencePort.getPaid(paidId);
    }

    @Override
    public void updatePaid(Paid paid) {
        paidPersistencePort.updatePaid(paid);
    }

    @Override
    public void deletePaid(Long paidId) {
        paidPersistencePort.deletePaid(paidId);
    }
}
