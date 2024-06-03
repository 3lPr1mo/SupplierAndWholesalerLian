package com.lian.supplierandwholesalerlian.application.mapper;

import com.lian.supplierandwholesalerlian.application.dto.SubcategoryRequest;
import com.lian.supplierandwholesalerlian.domain.model.SubCategory;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface SubcategoryRequestMapper {
    SubCategory toSubcategory(SubcategoryRequest subcategoryRequest);

}
