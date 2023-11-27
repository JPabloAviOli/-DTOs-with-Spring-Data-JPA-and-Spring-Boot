package com.pavila.projections.dto.service.impl;

import com.pavila.projections.dto.exception.ObjectNotFoundException;
import com.pavila.projections.dto.model.dto.CompanyCloseView;
import com.pavila.projections.dto.model.dto.CompanyDtoResponse;
import com.pavila.projections.dto.repository.ICompanyRepository;
import com.pavila.projections.dto.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements ICompanyService {
    @Autowired
    private ICompanyRepository companyRepository;

    @Override
    public List<CompanyDtoResponse> findCompanyBy() {
        return companyRepository.findCompanyBy();
    }

    @Override
    public List<CompanyCloseView> findBy() {
        return companyRepository.findBy();
    }

    @Override
    public Optional<CompanyCloseView> findCompanyById(Long id) {
        return companyRepository.findCompanyById(id);
    }
}
