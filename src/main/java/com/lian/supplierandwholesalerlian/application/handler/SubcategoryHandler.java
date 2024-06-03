package com.lian.supplierandwholesalerlian.application.handler;

import com.lian.supplierandwholesalerlian.application.dto.SubcategoryRequest;
import com.lian.supplierandwholesalerlian.application.dto.SubcategoryResponse;
import com.lian.supplierandwholesalerlian.application.mapper.SubcategoryRequestMapper;
import com.lian.supplierandwholesalerlian.application.mapper.SubcategoryResponseMapper;
import com.lian.supplierandwholesalerlian.domain.api.ICategoryServicePort;
import com.lian.supplierandwholesalerlian.domain.api.ISubcategoryServicePort;
import com.lian.supplierandwholesalerlian.domain.model.SubCategory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubcategoryHandler implements ISubcategoryHandler{

    private final ISubcategoryServicePort subcategoryServicePort;
    private final SubcategoryResponseMapper subcategoryResponseMapper;
    private final SubcategoryRequestMapper subcategoryRequestMapper;

    @Override
    public void saveSubcategoryInDb(SubcategoryRequest subcategoryRequest) {
        SubCategory subCategory = subcategoryRequestMapper.toSubcategory(subcategoryRequest);
        subcategoryServicePort.saveSubcategory(subCategory);
    }

    @Override
    public List<SubcategoryResponse> getAllSubcategoriesFromDb() {
        return subcategoryResponseMapper.toResponseList(subcategoryServicePort.getAllSubcategory());
    }

    @Override
    public SubcategoryResponse getSubcategoryFromDb(Long subcategoryId) {
        SubCategory subCategory = subcategoryServicePort.getSubcategory(subcategoryId);
        return subcategoryResponseMapper.toResponse(subCategory);
    }

    @Override
    public void updateSubcategoryInDb(SubcategoryRequest subcategoryRequest) {
        SubCategory oldSubCategory = subcategoryServicePort.getSubcategory(subcategoryRequest.getName());
        SubCategory newSubCategory = subcategoryRequestMapper.toSubcategory(subcategoryRequest);
        newSubCategory.setId(oldSubCategory.getId());
        newSubCategory.setCategoryId(oldSubCategory.getCategoryId());
        subcategoryServicePort.updateSubcategory(newSubCategory);
    }

    @Override
    public void deleteSubcategoryInDb(Long subcategoryId) {
        SubCategory subCategory = subcategoryServicePort.getSubcategory(subcategoryId);
        subcategoryServicePort.deleteSubcategory(subCategory.getId());
    }
}
