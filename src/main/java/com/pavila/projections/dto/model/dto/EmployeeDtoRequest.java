package com.pavila.projections.dto.model.dto;

import com.pavila.projections.dto.model.entity.Company;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDtoRequest {

    private Long id;
    private String name;
    private String lastName;
    private int cellphone;
    private String dni;
    private Company company;

}
