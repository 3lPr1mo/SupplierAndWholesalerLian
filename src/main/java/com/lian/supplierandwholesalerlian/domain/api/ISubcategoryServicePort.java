package com.lian.supplierandwholesalerlian.domain.api;

import com.lian.supplierandwholesalerlian.domain.model.SubCategory;

import java.util.List;

public interface ISubcategoryServicePort {
    void saveSubcategory(SubCategory subCategory);

    List<SubCategory> getAllSubcategory();

    SubCategory getSubcategory(Long id);

    SubCategory getSubcategory(String name);

    void updateSubcategory(SubCategory subCategory);

    void deleteSubcategory(Long id);
}
