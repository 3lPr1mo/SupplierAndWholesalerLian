package com.lian.supplierandwholesalerlian.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "transaction")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private String comment;

    @ManyToOne
    private UserEntity user;

    @OneToOne
    private TypeMovementEntity typeMovement;

    @OneToMany(mappedBy = "transaction")
    private List<DetailTransactionEntity> detailTransactions = new ArrayList<>();
}
