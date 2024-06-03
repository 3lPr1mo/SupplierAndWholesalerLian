package com.lian.supplierandwholesalerlian.infrastructure.output.jpa.repository;

import com.lian.supplierandwholesalerlian.infrastructure.output.jpa.entity.SubcategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ISubcategoryRepository extends JpaRepository<SubcategoryEntity, Long> {

    Optional<SubcategoryEntity> findById(Long subcategoryId);

    void deleteById(Long subcategoryId);

}
