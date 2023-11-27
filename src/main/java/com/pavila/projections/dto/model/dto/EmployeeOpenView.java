package com.pavila.projections.dto.model.dto;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeOpenView {
    //Nos permite unir dos o más columnas con los datos que deseamos devolver de nuestra entidad.
    //It allows us to join two or more columns with the data that we want to return from our entity

    @Value("#{target.name + ' ' + target.lastName}")
    String getNameAndLastname();
}
