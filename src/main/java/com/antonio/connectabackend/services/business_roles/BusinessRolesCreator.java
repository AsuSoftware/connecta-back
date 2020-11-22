package com.antonio.connectabackend.services.business_roles;

import com.antonio.connectabackend.models.BusinessRoles;
import com.antonio.connectabackend.models.dto.businessRoles.CreateBusinessRolesDto;

public interface BusinessRolesCreator {

    BusinessRoles create(CreateBusinessRolesDto createBusinessRolesDto);
}
