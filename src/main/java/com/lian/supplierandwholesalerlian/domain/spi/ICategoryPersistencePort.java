package com.lian.supplierandwholesalerlian.domain.spi;

import com.lian.supplierandwholesalerlian.domain.model.Category;

import java.util.List;

public interface ICategoryPersistencePort {
    void saveCategory(Category category);

    List<Category> getAllCategory();

    Category getCategory(Long categoryId);

    void updateCategory(Category category);

    void deleteCategory(Long categoryId);
}
