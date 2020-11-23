package com.antonio.connectabackend.controllers;

import com.antonio.connectabackend.models.dto.companyAreas.CompanyAreasDto;
import com.antonio.connectabackend.models.dto.companyAreas.CreateCompanyAreasDto;
import com.antonio.connectabackend.models.dto.companyAreas.UpdateCompanyAreasDto;
import com.antonio.connectabackend.models.dto.employee.UpdateEmployeeDto;
import com.antonio.connectabackend.services.company_areas.CompanyAreasService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/company_areas")
public class CompanyAreasController {

    private final CompanyAreasService companyAreasService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@Valid @RequestBody CreateCompanyAreasDto createCompanyAreasDto) {
        companyAreasService.register(createCompanyAreasDto);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<CompanyAreasDto> findAllCompanyAreas() {
        return companyAreasService.findAll();
    }

    @PutMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateCompanyAreas(@PathVariable UUID id, @RequestBody UpdateCompanyAreasDto updateCompanyAreasDtoDto) {
        companyAreasService.update(id, updateCompanyAreasDtoDto);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void removeCompanyAreas(@PathVariable UUID id) {
        companyAreasService.delete(id);
    }
    
}
