package com.lian.supplierandwholesalerlian.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer quantity;
    private Float priceSell;
    private Float priceBuy;

    @ManyToOne
    private SubcategoryEntity subcategory;

    @OneToMany(mappedBy = "product")
    private List<DetailTransactionEntity> detailTransactions = new ArrayList<>();

}
