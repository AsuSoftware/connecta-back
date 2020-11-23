package com.antonio.connectabackend.services.company_areas.impl;

import com.antonio.connectabackend.repositories.CompanyAreasRepository;
import com.antonio.connectabackend.services.company_areas.CompanyAreasRemoval;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CompanyAreasRemovalImpl implements CompanyAreasRemoval {

    private final CompanyAreasRepository companyAreasRepository;

    @Override
    public void delete(UUID id) {
        companyAreasRepository.deleteById(id);
    }
}
