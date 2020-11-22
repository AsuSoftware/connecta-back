package com.antonio.connectabackend.services.business_roles.impl;

import com.antonio.connectabackend.models.BusinessRoles;
import com.antonio.connectabackend.models.dto.businessRoles.CreateBusinessRolesDto;
import com.antonio.connectabackend.repositories.BusinessRolesRepository;
import com.antonio.connectabackend.services.business_roles.BusinessRolesCreator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
@RequiredArgsConstructor
public class BusinessRolesCreatorImpl implements BusinessRolesCreator {

    private final BusinessRolesRepository businessRolesRepository;

    @Override
    public BusinessRoles create(CreateBusinessRolesDto createBusinessRolesDto) {
        BusinessRoles businessRoles = createBusinessRoles(createBusinessRolesDto);
        return businessRolesRepository.save(businessRoles);
    }
    private BusinessRoles createBusinessRoles(CreateBusinessRolesDto createBusinessRolesDto) {
        BusinessRoles businessRoles = new BusinessRoles();
        businessRoles.setDescription(createBusinessRolesDto.getDescription());
        businessRoles.setInsert_by(createBusinessRolesDto.getInsert_by());
        businessRoles.setInsert_date(LocalDateTime.now(ZoneOffset.UTC));
        return businessRoles;
    }
}
