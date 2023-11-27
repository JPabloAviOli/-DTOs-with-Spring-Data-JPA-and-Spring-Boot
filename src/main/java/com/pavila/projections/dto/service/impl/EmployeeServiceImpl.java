package com.pavila.projections.dto.service.impl;

import com.pavila.projections.dto.exception.ObjectNotFoundException;
import com.pavila.projections.dto.model.dto.EmployeeDtoRequest;
import com.pavila.projections.dto.model.dto.EmployeeDtoResponse;
import com.pavila.projections.dto.model.dto.EmployeeOpenView;
import com.pavila.projections.dto.model.entity.Employee;
import com.pavila.projections.dto.repository.IEmployeeRepository;
import com.pavila.projections.dto.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public EmployeeDtoResponse save(EmployeeDtoRequest emRequest) {
       Employee employee = Employee.builder()
               .name(emRequest.getName())
               .lastName(emRequest.getLastName())
               .cellphone(emRequest.getCellphone())
               .dni(emRequest.getDni())
               .company(emRequest.getCompany())
               .build();

       Employee employeeSave = employeeRepository.save(employee);
       return EmployeeDtoResponse.builder()
               .name(employeeSave.getName())
               .lastName(employeeSave.getLastName())
               .cellphone(employeeSave.getCellphone())
               .company(employeeSave.getCompany())
               .build();
    }

    @Override
    public List<EmployeeDtoResponse> findEmployeeBy() {
        return employeeRepository.findEmployeeBy();
    }

    @Override
    public EmployeeDtoResponse find(Long id) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow( ()-> new ObjectNotFoundException("Employee not found with id: " + id));

        return EmployeeDtoResponse.builder()
                .name(employee.getName())
                .lastName(employee.getLastName())
                .cellphone(employee.getCellphone())
                .company(employee.getCompany())
                .build();
    }

    @Override
    public List<EmployeeOpenView> findBy() {
        return employeeRepository.findBy();
    }

    @Override
    public EmployeeDtoResponse findEmployeeByLastNameClassDto(String lastName) {
        return employeeRepository.findEmployeeByLastName(lastName, EmployeeDtoResponse.class);
    }

    @Override
    public EmployeeOpenView findEmployeeByLastNameOpenView(String lastName) {
        return employeeRepository.findEmployeeByLastName(lastName, EmployeeOpenView.class);
    }
}
