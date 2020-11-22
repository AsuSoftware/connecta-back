package com.antonio.connectabackend.services.office.impl;

import com.antonio.connectabackend.repositories.OfficeRepository;
import com.antonio.connectabackend.services.office.OfficeRemoval;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OfficeRemovalImpl implements OfficeRemoval {

    private final OfficeRepository officeRepository;

    @Override
    public void delete(UUID id) {
        officeRepository.deleteById(id);
    }
}
