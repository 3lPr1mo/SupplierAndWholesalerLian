package com.lian.supplierandwholesalerlian.infrastructure.output.jpa.mapper;

import com.lian.supplierandwholesalerlian.domain.model.SubCategory;
import com.lian.supplierandwholesalerlian.infrastructure.output.jpa.entity.SubcategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface SubcategoryEntityMapper {
    SubcategoryEntity toEntity(SubCategory subCategory);

    SubCategory toSubcategory(SubcategoryEntity subcategoryEntity);

    List<SubCategory> toSubcategories(List<SubcategoryEntity> subcategoryEntityList);
}
