package com.antonio.connectabackend.services.business_roles.impl;

import com.antonio.connectabackend.repositories.BusinessRolesRepository;
import com.antonio.connectabackend.services.business_roles.BusinessRolesRemoval;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BusinessRolesRemovalImpl implements BusinessRolesRemoval {

    private final BusinessRolesRepository businessRolesRepository;

    @Override
    public void delete(UUID id) {
        businessRolesRepository.deleteById(id);
    }
}
