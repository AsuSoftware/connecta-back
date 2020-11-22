package com.antonio.connectabackend.services.office;

import com.antonio.connectabackend.models.dto.office.UpdateOfficeDto;

import java.util.UUID;

public interface OfficeUpdater {
    void update(UUID id, UpdateOfficeDto updateOfficeDto);
}
