package com.lian.supplierandwholesalerlian.domain.api;

import com.lian.supplierandwholesalerlian.domain.model.TypeMovement;

import java.util.List;

public interface ITypeMovementServicePort {
    void saveTypeMovement(TypeMovement typeMovement);

    List<TypeMovement> getAllTypeMovement();

    TypeMovement getTypeMovement(Long typeMovementId);

    void updateTypeMovement(TypeMovement typeMovement);

    void deleteTypeMovement(Long typeMovementId);
}
