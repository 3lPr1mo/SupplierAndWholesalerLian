package com.lian.supplierandwholesalerlian.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "subcategory")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SubcategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private CategoryEntity category;

    @OneToMany(mappedBy = "subcategory")
    private List<ProductEntity> products = new ArrayList<>();

}
