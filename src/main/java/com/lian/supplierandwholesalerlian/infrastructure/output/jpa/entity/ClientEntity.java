package com.lian.supplierandwholesalerlian.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Float priceOwe;

    @OneToMany(mappedBy = "client")
    private List<PaidEntity> paids = new ArrayList<>();

    @OneToMany(mappedBy = "client")
    private List<DetailTransactionEntity> detailTransactions = new ArrayList<>();

}
