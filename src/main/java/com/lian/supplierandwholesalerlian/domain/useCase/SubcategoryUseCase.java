package com.lian.supplierandwholesalerlian.domain.useCase;

import com.lian.supplierandwholesalerlian.domain.api.ISubcategoryServicePort;
import com.lian.supplierandwholesalerlian.domain.model.SubCategory;
import com.lian.supplierandwholesalerlian.domain.spi.ISubcategoryPersistencePort;

import java.util.List;

public class SubcategoryUseCase implements ISubcategoryServicePort {

    private final ISubcategoryPersistencePort subcategoryPersistencePort;

    public SubcategoryUseCase(ISubcategoryPersistencePort subcategoryPersistencePort) {
        this.subcategoryPersistencePort = subcategoryPersistencePort;
    }

    @Override
    public void saveSubcategory(SubCategory subCategory) {
        subcategoryPersistencePort.saveSubcategory(subCategory);
    }

    @Override
    public List<SubCategory> getAllSubcategory() {
        return subcategoryPersistencePort.getAllSubcategory();
    }

    @Override
    public SubCategory getSubcategory(Long id) {
        return subcategoryPersistencePort.getSubcategory(id);
    }

    @Override
    public SubCategory getSubcategory(String name) {
        return null;
    }

    @Override
    public void updateSubcategory(SubCategory subCategory) {
        subcategoryPersistencePort.updateSubcategory(subCategory);
    }

    @Override
    public void deleteSubcategory(Long id) {
        subcategoryPersistencePort.deleteSubcategory(id);
    }
}
