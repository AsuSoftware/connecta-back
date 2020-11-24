package com.antonio.connectabackend.controllers;

import com.antonio.connectabackend.models.dto.businessRoles.BusinessRolesDto;
import com.antonio.connectabackend.models.dto.businessRoles.CreateBusinessRolesDto;
import com.antonio.connectabackend.models.dto.businessRoles.UpdateBusinessRolesDto;
import com.antonio.connectabackend.services.business_roles.BusinessRolesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/business_roles")
public class BusinessRolesController {

    private final BusinessRolesService businessRolesService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@Valid @RequestBody CreateBusinessRolesDto createBusinessRolesDto) {
        businessRolesService.register(createBusinessRolesDto);
    }

    @GetMapping
    //@ResponseStatus(HttpStatus.FOUND)
    public List<BusinessRolesDto> findAllBusinessRoles() {
        return businessRolesService.findAll();
    }

    @PutMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateBusinessRoles(@PathVariable UUID id, @RequestBody UpdateBusinessRolesDto updateBusinessRolesDto) {
        businessRolesService.update(id, updateBusinessRolesDto);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void removeBusinessRoles(@PathVariable UUID id) {
        businessRolesService.delete(id);
    }
}
