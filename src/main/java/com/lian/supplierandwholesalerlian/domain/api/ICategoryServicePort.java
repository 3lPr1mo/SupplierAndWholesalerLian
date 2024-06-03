package com.lian.supplierandwholesalerlian.domain.api;

import com.lian.supplierandwholesalerlian.domain.model.Category;

import java.util.List;

public interface ICategoryServicePort {
    void saveCategory(Category category);

    List<Category> getAllCategory();

    Category getCategory(Long categoryId);

    void updateCategory(Category category);

    void deleteCategory(Long categoryId);
}
