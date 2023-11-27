package com.pavila.projections.dto.repository;

import com.pavila.projections.dto.model.dto.CompanyCloseView;
import com.pavila.projections.dto.model.dto.CompanyDtoResponse;
import com.pavila.projections.dto.model.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ICompanyRepository extends JpaRepository<Company, Long> {


    List<CompanyDtoResponse> findCompanyBy();// Dto class

    List<CompanyCloseView> findBy();   //Closed interface dto

    Optional<CompanyCloseView> findCompanyById(Long id);    //Closed interface dto


}
