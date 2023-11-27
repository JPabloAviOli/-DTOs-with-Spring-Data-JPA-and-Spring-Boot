package com.pavila.projections.dto.model.dto;

import com.pavila.projections.dto.model.entity.Company;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class EmployeeDtoResponse {
    //Esta clase dto nos permite retornar una lista o una clase con los datos que necesitemos de nuestra entidad.
    //This dto class works to return a list or a class with the data we need from our entity..
    private String name;
    private String lastName;
    private int cellphone;
    private Company company;

}
