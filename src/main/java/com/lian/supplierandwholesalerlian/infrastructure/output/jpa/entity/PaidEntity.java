package com.lian.supplierandwholesalerlian.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "paid")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PaidEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Float pricePaid;

    @ManyToOne
    private ClientEntity client;

}
