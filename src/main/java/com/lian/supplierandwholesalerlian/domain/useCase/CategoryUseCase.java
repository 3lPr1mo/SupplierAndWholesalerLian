package com.lian.supplierandwholesalerlian.domain.useCase;

import com.lian.supplierandwholesalerlian.domain.api.ICategoryServicePort;
import com.lian.supplierandwholesalerlian.domain.model.Category;
import com.lian.supplierandwholesalerlian.domain.spi.ICategoryPersistencePort;

import java.util.List;

public class CategoryUseCase implements ICategoryServicePort {

    private final ICategoryPersistencePort categoryPersistencePort;

    public CategoryUseCase(ICategoryPersistencePort categoryPersistencePort) {
        this.categoryPersistencePort = categoryPersistencePort;
    }

    @Override
    public void saveCategory(Category category) {
        categoryPersistencePort.saveCategory(category);
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryPersistencePort.getAllCategory();
    }

    @Override
    public Category getCategory(Long categoryId) {
        return categoryPersistencePort.getCategory(categoryId);
    }

    @Override
    public void updateCategory(Category category) {
        categoryPersistencePort.updateCategory(category);
    }

    @Override
    public void deleteCategory(Long categoryId) {
        categoryPersistencePort.deleteCategory(categoryId);
    }
}
