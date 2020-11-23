package com.antonio.connectabackend.services.company_areas;

import com.antonio.connectabackend.models.dto.companyAreas.UpdateCompanyAreasDto;

import java.util.UUID;

public interface CompanyAreasUpdater {
    void update(UUID id, UpdateCompanyAreasDto updateCompanyAreasDto);
}
