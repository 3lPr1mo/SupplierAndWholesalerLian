package com.lian.supplierandwholesalerlian.infrastructure.output.jpa.adapter;

import com.lian.supplierandwholesalerlian.domain.model.SubCategory;
import com.lian.supplierandwholesalerlian.domain.spi.ISubcategoryPersistencePort;
import com.lian.supplierandwholesalerlian.infrastructure.exception.NoDataFoundException;
import com.lian.supplierandwholesalerlian.infrastructure.exception.SubcategoryAlreadyExistsException;
import com.lian.supplierandwholesalerlian.infrastructure.exception.SubcategoryNotFoundException;
import com.lian.supplierandwholesalerlian.infrastructure.output.jpa.entity.SubcategoryEntity;
import com.lian.supplierandwholesalerlian.infrastructure.output.jpa.mapper.SubcategoryEntityMapper;
import com.lian.supplierandwholesalerlian.infrastructure.output.jpa.repository.ISubcategoryRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class SubcategoryAdapter implements ISubcategoryPersistencePort {
    private final ISubcategoryRepository subcategoryRepository;
    private final SubcategoryEntityMapper subcategoryEntityMapper;

    @Override
    public void saveSubcategory(SubCategory subCategory) {
        if(subcategoryRepository.findById(subCategory.getId()).isPresent()){
            throw new SubcategoryAlreadyExistsException();
        }
        subcategoryRepository.save(subcategoryEntityMapper.toEntity(subCategory));
    }

    @Override
    public List<SubCategory> getAllSubcategory() {
        List<SubcategoryEntity> subcategoryEntityList = subcategoryRepository.findAll();
        if(subcategoryEntityList.isEmpty()){
            throw new NoDataFoundException();
        }
        return subcategoryEntityMapper.toSubcategories(subcategoryEntityList);
    }

    @Override
    public SubCategory getSubcategory(Long id) {
        return subcategoryEntityMapper.toSubcategory(subcategoryRepository.findById(id)
                .orElseThrow(SubcategoryNotFoundException::new));
    }

    @Override
    public void updateSubcategory(SubCategory subCategory) {
        subcategoryRepository.save(subcategoryEntityMapper.toEntity(subCategory));
    }

    @Override
    public void deleteSubcategory(Long id) {
        subcategoryRepository.deleteById(id);
    }
}
