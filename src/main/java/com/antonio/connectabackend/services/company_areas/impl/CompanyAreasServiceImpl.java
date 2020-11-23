package com.antonio.connectabackend.services.company_areas.impl;

import com.antonio.connectabackend.models.dto.companyAreas.CompanyAreasDto;
import com.antonio.connectabackend.models.dto.companyAreas.CreateCompanyAreasDto;
import com.antonio.connectabackend.models.dto.companyAreas.UpdateCompanyAreasDto;
import com.antonio.connectabackend.models.dto.office.OfficeDto;
import com.antonio.connectabackend.services.company_areas.CompanyAreasService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class CompanyAreasServiceImpl implements CompanyAreasService {

    private final CompanyAreasCreatorImpl companyAreasCreator;
    private final CompanyAreasFinderImpl companyAreasFinder;
    private final CompanyAreasRemovalImpl companyAreasRemoval;
    private final CompanyAreasUpdaterImpl companyAreasUpdater;

    @Override
    public void register(CreateCompanyAreasDto createCompanyAreasDto) {
        companyAreasCreator.add(createCompanyAreasDto);
    }

    @Override
    public void update(UUID id, UpdateCompanyAreasDto updateCompanyAreasDto) {
        companyAreasUpdater.update(id, updateCompanyAreasDto);
    }

    @Override
    public List<CompanyAreasDto> findAll() {
    System.out.println(companyAreasFinder.findAll());
       return companyAreasFinder.findAll().stream().map(CompanyAreasDto::mapFromEntity).collect(Collectors.toList());
    }

    @Override
    public void delete(UUID id) {
        companyAreasRemoval.delete(id);
    }
}
