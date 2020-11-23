package com.antonio.connectabackend.services.business_roles;

import com.antonio.connectabackend.models.BusinessRoles;
import com.antonio.connectabackend.models.dto.businessRoles.BusinessRolesDto;

import java.util.List;

public interface BusinessRolesFinder {
    List<BusinessRolesDto> findAll();
}
