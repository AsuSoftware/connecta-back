package com.antonio.connectabackend.services.office;

import com.antonio.connectabackend.models.dto.office.CreateOfficeDto;
import com.antonio.connectabackend.models.dto.office.OfficeDto;
import com.antonio.connectabackend.models.dto.office.UpdateOfficeDto;

import java.util.List;
import java.util.UUID;

public interface OfficeService {

    void register(CreateOfficeDto createOfficeDtoDto);
    void update(UUID id, UpdateOfficeDto updateOfficeDto);
    List<OfficeDto> findAll();
    void delete(UUID id);
}
