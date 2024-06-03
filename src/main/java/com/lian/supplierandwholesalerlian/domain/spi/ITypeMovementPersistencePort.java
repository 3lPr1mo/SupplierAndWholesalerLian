package com.lian.supplierandwholesalerlian.domain.spi;

import com.lian.supplierandwholesalerlian.domain.model.TypeMovement;

import java.util.List;

public interface ITypeMovementPersistencePort {
    void saveTypeMovement(TypeMovement typeMovement);

    List<TypeMovement> getAllTypeMovement();

    TypeMovement getTypeMovement(Long typeMovementId);

    void updateTypeMovement(TypeMovement typeMovement);

    void deleteTypeMovement(Long typeMovementId);
}
