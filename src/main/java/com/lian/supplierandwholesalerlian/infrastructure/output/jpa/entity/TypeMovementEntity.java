package com.lian.supplierandwholesalerlian.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "type_movement")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class TypeMovementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
