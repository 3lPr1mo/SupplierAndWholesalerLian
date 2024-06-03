package com.lian.supplierandwholesalerlian.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "detail_transaction")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DetailTransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quiantity;

    @ManyToOne
    private TransactionEntity transaction;

    @ManyToOne
    private ProductEntity product;

    @ManyToOne
    private ClientEntity client;

}
