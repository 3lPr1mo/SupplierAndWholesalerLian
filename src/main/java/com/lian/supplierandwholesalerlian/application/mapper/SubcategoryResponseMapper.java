package com.lian.supplierandwholesalerlian.application.mapper;

import com.lian.supplierandwholesalerlian.application.dto.SubcategoryResponse;
import com.lian.supplierandwholesalerlian.domain.model.SubCategory;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SubcategoryResponseMapper {
    SubcategoryResponse toResponse(SubCategory subCategory);

    default List<SubcategoryResponse> toResponseList(List<SubCategory> subCategoryList) {
        return subCategoryList.stream()
                .map(subCategory -> {
                    SubcategoryResponse subcategoryResponse = new SubcategoryResponse();
                    subcategoryResponse.setName(subcategoryResponse.getName());
                    return subcategoryResponse;
                }).toList();
    }
}
