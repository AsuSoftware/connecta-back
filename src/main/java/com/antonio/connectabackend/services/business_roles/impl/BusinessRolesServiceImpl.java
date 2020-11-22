package com.antonio.connectabackend.services.business_roles.impl;

import com.antonio.connectabackend.models.BusinessRoles;
import com.antonio.connectabackend.models.dto.businessRoles.CreateBusinessRolesDto;
import com.antonio.connectabackend.models.dto.businessRoles.UpdateBusinessRoles;
import com.antonio.connectabackend.services.business_roles.BusinessRolesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BusinessRolesServiceImpl implements BusinessRolesService {

    private final BusinessRolesCreatorImpl businessRolesCreator;
    private final BusinessRolesUpdaterImpl businessRolesUpdater;

    @Override
    public BusinessRoles register(CreateBusinessRolesDto createBusinessRolesDto) {
        return businessRolesCreator.create(createBusinessRolesDto);
    }

    @Override
    public void update(UUID id, UpdateBusinessRoles updateBusinessRoles) {
        businessRolesUpdater.update(id, updateBusinessRoles);
    }
}
