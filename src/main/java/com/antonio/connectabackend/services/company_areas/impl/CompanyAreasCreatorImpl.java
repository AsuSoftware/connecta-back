package com.antonio.connectabackend.services.company_areas.impl;

import com.antonio.connectabackend.exceptions.office.OfficeNotFoundException;
import com.antonio.connectabackend.models.CompanyAreas;
import com.antonio.connectabackend.models.Office;
import com.antonio.connectabackend.models.dto.companyAreas.CreateCompanyAreasDto;
import com.antonio.connectabackend.repositories.CompanyAreasRepository;
import com.antonio.connectabackend.repositories.OfficeRepository;
import com.antonio.connectabackend.services.company_areas.CompanyAreasCreator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
@RequiredArgsConstructor
public class CompanyAreasCreatorImpl implements CompanyAreasCreator {

    private final CompanyAreasRepository companyAreasRepository;
    private final OfficeRepository officeRepository;

    @Override
    public void add(CreateCompanyAreasDto createCompanyAreasDto) {
        CompanyAreas companyAreas = createCompanyAreas(createCompanyAreasDto);
        // search for the particular office by it id
        Office office = officeRepository.findById(createCompanyAreasDto.getOffice().getId()).orElseThrow(OfficeNotFoundException::new);
        // after that, set the office in the company areas
        companyAreas.setOffice(office);
        // save company areas in db
        companyAreasRepository.save(companyAreas);
    }

    private CompanyAreas createCompanyAreas(CreateCompanyAreasDto createCompanyAreasDto) {
        CompanyAreas companyAreas = new CompanyAreas();
        companyAreas.setName(createCompanyAreasDto.getName());
        companyAreas.setDescription(createCompanyAreasDto.getDescription());
        companyAreas.setInsert_by(createCompanyAreasDto.getInsert_by());
        companyAreas.setInsert_date(LocalDateTime.now(ZoneOffset.UTC));
        return companyAreas;
    }
}
