package com.antonio.connectabackend.services.company_areas;

import com.antonio.connectabackend.models.dto.companyAreas.CompanyAreasDto;
import com.antonio.connectabackend.models.dto.companyAreas.CreateCompanyAreasDto;
import com.antonio.connectabackend.models.dto.companyAreas.UpdateCompanyAreasDto;

import java.util.List;
import java.util.UUID;

public interface CompanyAreasService {
    void register(CreateCompanyAreasDto createCompanyAreasDto);
    void update(UUID id, UpdateCompanyAreasDto updateCompanyAreasDto);
    List<CompanyAreasDto> findAll();
    void delete(UUID id);
}
