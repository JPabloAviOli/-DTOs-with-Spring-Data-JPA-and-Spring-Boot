package com.pavila.projections.dto.model.dto;

public interface EmployeeCloseView {
    String getName();
    String getLastName();

    CompanyCloseView getCompany();
    //Podemos unir dos interfaces cerradas.
    //We can join two closed interfaces.
}
