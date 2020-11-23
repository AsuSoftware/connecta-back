package com.antonio.connectabackend.services.business_roles.impl;

import com.antonio.connectabackend.models.BusinessRoles;
import com.antonio.connectabackend.models.dto.businessRoles.BusinessRolesDto;
import com.antonio.connectabackend.repositories.BusinessRolesRepository;
import com.antonio.connectabackend.services.business_roles.BusinessRolesFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BusinessRolesFinderImpl implements BusinessRolesFinder {

    private final BusinessRolesRepository businessRolesRepository;

    @Override
    public List<BusinessRolesDto> findAll() {
        return businessRolesRepository.findAll().stream().map(BusinessRolesDto::mapFromEntity).collect(Collectors.toList());
    }
}
