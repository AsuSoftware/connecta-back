package com.antonio.connectabackend.services.company_areas.impl;

import com.antonio.connectabackend.exceptions.companyAreas.CompanyAreasNotFoundException;
import com.antonio.connectabackend.exceptions.office.OfficeNotFoundException;
import com.antonio.connectabackend.models.CompanyAreas;
import com.antonio.connectabackend.models.dto.companyAreas.UpdateCompanyAreasDto;
import com.antonio.connectabackend.repositories.CompanyAreasRepository;
import com.antonio.connectabackend.repositories.OfficeRepository;
import com.antonio.connectabackend.services.company_areas.CompanyAreasUpdater;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CompanyAreasUpdaterImpl implements CompanyAreasUpdater {

    private final CompanyAreasRepository companyAreasRepository;
    private final OfficeRepository officeRepository;

    @Override
    public void update(UUID id, UpdateCompanyAreasDto updateCompanyAreasDto) {
        CompanyAreas companyAreas = companyAreasRepository.findById(id).orElseThrow(CompanyAreasNotFoundException::new);
        companyAreasRepository.save(updateCompanyAreas(companyAreas, updateCompanyAreasDto));
    }

    private CompanyAreas updateCompanyAreas(CompanyAreas companyAreas, UpdateCompanyAreasDto updateCompanyAreasDto) {
        companyAreas.setName(updateCompanyAreasDto.getName());
        companyAreas.setDescription(updateCompanyAreasDto.getDescription());
        companyAreas.setInsert_by(updateCompanyAreasDto.getInsert_by());
        companyAreas.setInsert_date(updateCompanyAreasDto.getInsert_date());
        companyAreas.setModify_by(updateCompanyAreasDto.getModify_by());
        companyAreas.setModify_date(LocalDateTime.now(ZoneOffset.UTC));
        companyAreas.setOffice(officeRepository.findById(updateCompanyAreasDto.getOffice().getId()).orElseThrow(OfficeNotFoundException::new));
        return companyAreas;
    }
}
