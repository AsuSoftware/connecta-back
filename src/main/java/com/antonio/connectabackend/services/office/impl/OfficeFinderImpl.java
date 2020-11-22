package com.antonio.connectabackend.services.office.impl;

import com.antonio.connectabackend.models.Office;
import com.antonio.connectabackend.repositories.OfficeRepository;
import com.antonio.connectabackend.services.office.OfficeFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OfficeFinderImpl implements OfficeFinder {

    private final OfficeRepository officeRepository;

    @Override
    public List<Office> findAll() {
        return officeRepository.findAll();
    }
}
