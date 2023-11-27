package com.pavila.projections.dto.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private Long id;

    private String name;
    @Column(name = "last_name")
    private String lastName;

    private int cellphone;
    private String dni;

    @ManyToOne
    @JoinColumn(name = "id_company")
    private Company company;

}
