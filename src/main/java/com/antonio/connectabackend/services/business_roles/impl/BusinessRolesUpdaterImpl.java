package com.antonio.connectabackend.services.business_roles.impl;

import com.antonio.connectabackend.exceptions.businessRoles.BusinessRolesNotFoundException;
import com.antonio.connectabackend.models.BusinessRoles;
import com.antonio.connectabackend.models.dto.businessRoles.UpdateBusinessRoles;
import com.antonio.connectabackend.repositories.BusinessRolesRepository;
import com.antonio.connectabackend.services.business_roles.BusinessRolesUpdater;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BusinessRolesUpdaterImpl implements BusinessRolesUpdater {

    private final BusinessRolesRepository businessRolesRepository;

    @Override
    public void update(UUID id, UpdateBusinessRoles updateBusinessRoles) {
        BusinessRoles businessRoles = businessRolesRepository.findById(id).orElseThrow(BusinessRolesNotFoundException::new);
        businessRoles.setDescription(updateBusinessRoles.getDescription());
        businessRoles.setInsert_by(updateBusinessRoles.getInsert_by());
        businessRoles.setInsert_date(updateBusinessRoles.getInsert_date());
        businessRoles.setModify_by(updateBusinessRoles.getModify_by());
        businessRoles.setModify_date(LocalDateTime.now(ZoneOffset.UTC));
        businessRolesRepository.save(businessRoles);
    }
}
