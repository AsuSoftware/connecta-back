package com.antonio.connectabackend.services.business_roles;

import com.antonio.connectabackend.models.BusinessRoles;
import com.antonio.connectabackend.models.dto.businessRoles.CreateBusinessRolesDto;
import com.antonio.connectabackend.models.dto.businessRoles.UpdateBusinessRoles;

import java.util.UUID;

public interface BusinessRolesService {
    BusinessRoles register(CreateBusinessRolesDto createBusinessRolesDto);
    void update(UUID id, UpdateBusinessRoles updateBusinessRoles);
}
