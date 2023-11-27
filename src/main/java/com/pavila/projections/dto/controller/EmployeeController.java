package com.pavila.projections.dto.controller;

import com.pavila.projections.dto.model.dto.EmployeeDtoRequest;
import com.pavila.projections.dto.model.dto.EmployeeDtoResponse;
import com.pavila.projections.dto.model.dto.EmployeeOpenView;
import com.pavila.projections.dto.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @PostMapping()
    public ResponseEntity<EmployeeDtoResponse> save(@RequestBody EmployeeDtoRequest employeeDtoRequest){
        EmployeeDtoResponse employeeDto = employeeService.save(employeeDtoRequest);
        return ResponseEntity.ok(employeeDto);
    }

    @GetMapping("all")
    public ResponseEntity<List<EmployeeDtoResponse>> getAll(){
        List<EmployeeDtoResponse> employeeList = employeeService.findEmployeeBy();
        return ResponseEntity.ok(employeeList);
    }
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDtoResponse> find(@PathVariable Long id){
        EmployeeDtoResponse employee = employeeService.find(id);
        return ResponseEntity.ok(employee);
    }
    @GetMapping("open-view")
    public ResponseEntity<List<EmployeeOpenView>> findBy(){
       List<EmployeeOpenView> employeeOpenView = employeeService.findBy();
        return ResponseEntity.ok(employeeOpenView);
    }

    @GetMapping("interface/{lastName}")
    public EmployeeOpenView findByOpenView(@PathVariable String lastName){
        return employeeService.findEmployeeByLastNameOpenView(lastName);
    }

    @GetMapping("class/{lastName}")
    public EmployeeDtoResponse findByEmployeeDto(@PathVariable String lastName){
        return employeeService.findEmployeeByLastNameClassDto(lastName);

    }

}
