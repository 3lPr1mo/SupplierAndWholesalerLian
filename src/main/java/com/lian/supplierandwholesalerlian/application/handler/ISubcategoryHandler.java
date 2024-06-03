package com.lian.supplierandwholesalerlian.application.handler;

import com.lian.supplierandwholesalerlian.application.dto.SubcategoryRequest;
import com.lian.supplierandwholesalerlian.application.dto.SubcategoryResponse;

import java.util.List;

public interface ISubcategoryHandler {
    void saveSubcategoryInDb(SubcategoryRequest subcategoryRequest);

    List<SubcategoryResponse> getAllSubcategoriesFromDb();

    SubcategoryResponse getSubcategoryFromDb(Long subcategoryId);

    void updateSubcategoryInDb(SubcategoryRequest subcategoryRequest);

    void deleteSubcategoryInDb(Long subcategoryId);
}
