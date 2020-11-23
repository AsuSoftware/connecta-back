package com.antonio.connectabackend.services.business_roles;

import com.antonio.connectabackend.models.dto.businessRoles.UpdateBusinessRolesDto;

import java.util.UUID;

public interface BusinessRolesUpdater {
    void update(UUID id, UpdateBusinessRolesDto updateBusinessRolesDto);
}
