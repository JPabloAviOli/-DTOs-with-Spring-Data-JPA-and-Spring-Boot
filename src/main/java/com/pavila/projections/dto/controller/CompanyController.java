package com.pavila.projections.dto.controller;

import com.pavila.projections.dto.model.dto.CompanyCloseView;
import com.pavila.projections.dto.model.dto.CompanyDtoResponse;
import com.pavila.projections.dto.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("company")
public class CompanyController {

    @Autowired
    private ICompanyService companyService;

    @GetMapping("all")
    public ResponseEntity<List<CompanyDtoResponse>> getAll(){
        List<CompanyDtoResponse> companyDtoResponse = companyService.findCompanyBy();
            return ResponseEntity.ok(companyDtoResponse);
    }
    @GetMapping
    public ResponseEntity<List<CompanyCloseView>> getCloseView(){
        List<CompanyCloseView> companyCloseView = companyService.findBy();
        return ResponseEntity.ok(companyCloseView);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<CompanyCloseView>> findOne(@PathVariable Long id){
      Optional<CompanyCloseView> companyCloseView = companyService.findCompanyById(id);
      return ResponseEntity.ok(companyCloseView);
    }

}
