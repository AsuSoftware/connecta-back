package com.antonio.connectabackend.services.office.impl;

import com.antonio.connectabackend.models.dto.office.CreateOfficeDto;
import com.antonio.connectabackend.models.dto.office.OfficeDto;
import com.antonio.connectabackend.models.dto.office.UpdateOfficeDto;
import com.antonio.connectabackend.services.office.OfficeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OfficeServiceImpl implements OfficeService {

    private final OfficeCreatorImpl officeCreator;
    private final OfficeFinderImpl officeFinder;
    private final OfficeUpdaterImpl officeUpdater;
    private final OfficeRemovalImpl officeRemoval;

    @Override
    public void register(CreateOfficeDto createOfficeDtoDto) {
        officeCreator.create(createOfficeDtoDto);
    }

    @Override
    public void update(UUID id, UpdateOfficeDto updateOfficeDto) {
        officeUpdater.update(id, updateOfficeDto);
    }

    @Override
    public List<OfficeDto> findAll() {
        return officeFinder.findAll().stream().map(OfficeDto::mapFromEntity).collect(Collectors.toList());
    }

    @Override
    public void delete(UUID id) {
        officeRemoval.delete(id);
    }
}
