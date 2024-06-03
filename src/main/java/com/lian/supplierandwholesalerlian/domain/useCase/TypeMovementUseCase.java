package com.lian.supplierandwholesalerlian.domain.useCase;

import com.lian.supplierandwholesalerlian.domain.api.ITypeMovementServicePort;
import com.lian.supplierandwholesalerlian.domain.model.TypeMovement;
import com.lian.supplierandwholesalerlian.domain.spi.ITypeMovementPersistencePort;

import java.util.List;

public class TypeMovementUseCase implements ITypeMovementServicePort {

    private final ITypeMovementPersistencePort typeMovementPersistencePort;

    public TypeMovementUseCase(ITypeMovementPersistencePort typeMovementPersistencePort) {
        this.typeMovementPersistencePort = typeMovementPersistencePort;
    }

    @Override
    public void saveTypeMovement(TypeMovement typeMovement) {
        typeMovementPersistencePort.saveTypeMovement(typeMovement);
    }

    @Override
    public List<TypeMovement> getAllTypeMovement() {
        return typeMovementPersistencePort.getAllTypeMovement();
    }

    @Override
    public TypeMovement getTypeMovement(Long typeMovementId) {
        return typeMovementPersistencePort.getTypeMovement(typeMovementId);
    }

    @Override
    public void updateTypeMovement(TypeMovement typeMovement) {
        typeMovementPersistencePort.updateTypeMovement(typeMovement);
    }

    @Override
    public void deleteTypeMovement(Long typeMovementId) {
        typeMovementPersistencePort.deleteTypeMovement(typeMovementId);
    }
}
