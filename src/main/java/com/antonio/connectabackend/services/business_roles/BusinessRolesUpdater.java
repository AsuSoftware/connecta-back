package com.antonio.connectabackend.services.business_roles;

import com.antonio.connectabackend.models.dto.businessRoles.UpdateBusinessRoles;

import java.util.UUID;

public interface BusinessRolesUpdater {
    void update(UUID id, UpdateBusinessRoles updateBusinessRoles);
}
