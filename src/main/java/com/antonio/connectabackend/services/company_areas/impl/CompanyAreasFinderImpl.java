package com.antonio.connectabackend.services.company_areas.impl;

import com.antonio.connectabackend.models.CompanyAreas;
import com.antonio.connectabackend.repositories.CompanyAreasRepository;
import com.antonio.connectabackend.services.company_areas.CompanyAreasFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyAreasFinderImpl implements CompanyAreasFinder {

    private final CompanyAreasRepository companyAreasRepository;

    @Override
    public List<CompanyAreas> findAll() {
        return companyAreasRepository.findAll();
    }
}
