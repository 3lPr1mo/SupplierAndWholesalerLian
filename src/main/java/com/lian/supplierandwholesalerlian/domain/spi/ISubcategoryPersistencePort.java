package com.lian.supplierandwholesalerlian.domain.spi;

import com.lian.supplierandwholesalerlian.domain.model.SubCategory;

import java.util.List;

public interface ISubcategoryPersistencePort {
    void saveSubcategory(SubCategory subCategory);

    List<SubCategory> getAllSubcategory();

    SubCategory getSubcategory(Long id);

    void updateSubcategory(SubCategory subCategory);

    void deleteSubcategory(Long id);
}
