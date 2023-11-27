package com.pavila.projections.dto.repository;

import com.pavila.projections.dto.model.dto.EmployeeDtoResponse;
import com.pavila.projections.dto.model.dto.EmployeeOpenView;
import com.pavila.projections.dto.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

    List<EmployeeDtoResponse> findEmployeeBy();    //Dto class

    List<EmployeeOpenView> findBy();    //Open interface

    <T> T findEmployeeByLastName(String lastName, Class<T> type);
    //Generic method to work with open or closed interfaces and also with classes
}
