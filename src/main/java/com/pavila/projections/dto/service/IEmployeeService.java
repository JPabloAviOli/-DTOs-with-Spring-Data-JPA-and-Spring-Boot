package com.pavila.projections.dto.service;

import com.pavila.projections.dto.model.dto.EmployeeDtoRequest;
import com.pavila.projections.dto.model.dto.EmployeeDtoResponse;
import com.pavila.projections.dto.model.dto.EmployeeOpenView;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {

    EmployeeDtoResponse save(EmployeeDtoRequest emRequest);
    List<EmployeeDtoResponse> findEmployeeBy();
    EmployeeDtoResponse find(Long id);

    List<EmployeeOpenView> findBy();

    EmployeeDtoResponse findEmployeeByLastNameClassDto(String lastName);

    EmployeeOpenView findEmployeeByLastNameOpenView(String lastName);
}
