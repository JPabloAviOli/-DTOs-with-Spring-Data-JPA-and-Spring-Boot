package com.pavila.projections.dto.service;

import com.pavila.projections.dto.model.dto.CompanyCloseView;
import com.pavila.projections.dto.model.dto.CompanyDtoResponse;

import java.util.List;
import java.util.Optional;

public interface ICompanyService {

    List<CompanyDtoResponse> findCompanyBy();

    List<CompanyCloseView> findBy();

    Optional<CompanyCloseView> findCompanyById(Long id);

}
