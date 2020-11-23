package com.antonio.connectabackend.services.business_roles.impl;

import com.antonio.connectabackend.models.BusinessRoles;
import com.antonio.connectabackend.models.dto.businessRoles.BusinessRolesDto;
import com.antonio.connectabackend.models.dto.businessRoles.CreateBusinessRolesDto;
import com.antonio.connectabackend.models.dto.businessRoles.UpdateBusinessRolesDto;
import com.antonio.connectabackend.services.business_roles.BusinessRolesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BusinessRolesServiceImpl implements BusinessRolesService {

    private final BusinessRolesCreatorImpl businessRolesCreator;
    private final BusinessRolesUpdaterImpl businessRolesUpdater;
    private final BusinessRolesFinderImpl businessRolesFinder;
    private final BusinessRolesRemovalImpl businessRolesRemoval;

    @Override
    public BusinessRoles register(CreateBusinessRolesDto createBusinessRolesDto) {
        return businessRolesCreator.create(createBusinessRolesDto);
    }

    @Override
    public void update(UUID id, UpdateBusinessRolesDto updateBusinessRolesDto) {
        businessRolesUpdater.update(id, updateBusinessRolesDto);
    }

    @Override
    public List<BusinessRolesDto> findAll() {
        return businessRolesFinder.findAll();
    }

    @Override
    public void delete(UUID id) {
        businessRolesRemoval.delete(id);
    }
}
