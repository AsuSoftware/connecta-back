package com.antonio.connectabackend.services.office.impl;

import com.antonio.connectabackend.exceptions.businessRoles.BusinessRolesNotFoundException;
import com.antonio.connectabackend.exceptions.office.OfficeNotFoundException;
import com.antonio.connectabackend.models.BusinessRoles;
import com.antonio.connectabackend.models.Office;
import com.antonio.connectabackend.models.dto.office.UpdateOfficeDto;
import com.antonio.connectabackend.repositories.BusinessRolesRepository;
import com.antonio.connectabackend.repositories.OfficeRepository;
import com.antonio.connectabackend.services.office.OfficeUpdater;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OfficeUpdaterImpl implements OfficeUpdater {

    private final OfficeRepository officeRepository;
    private final BusinessRolesRepository businessRolesRepository;

    @Override
    public void update(UUID id, UpdateOfficeDto updateOfficeDto) {
        Office office = officeRepository.findById(id).orElseThrow(OfficeNotFoundException::new);
        officeRepository.save(updateOffice(office, updateOfficeDto));
    }

    private Office updateOffice(Office office, UpdateOfficeDto updateOfficeDto) {
        office.setName(updateOfficeDto.getName());
        office.setAddress(updateOfficeDto.getAddress());
        office.setDistrict(updateOfficeDto.getDistrict());
        office.setPostal_code(updateOfficeDto.getPostal_code());
        office.setLocality(updateOfficeDto.getLocality());
        office.setCity(updateOfficeDto.getCity());
        office.setVat(updateOfficeDto.getVat());
        office.setPhone(updateOfficeDto.getPhone());
        office.setPec(updateOfficeDto.getPec());
        office.setEmail(updateOfficeDto.getEmail());
        office.setInsert_by(updateOfficeDto.getInsert_by());
        office.setInsert_date(updateOfficeDto.getInsert_date());
        office.setModify_by(updateOfficeDto.getModify_by());
        office.setModify_date(LocalDateTime.now(ZoneOffset.UTC));
        BusinessRoles businessRoles = businessRolesRepository.findById(updateOfficeDto.getBusinessRoles().getId()).orElseThrow(BusinessRolesNotFoundException::new);
        businessRoles.setDescription(updateOfficeDto.getBusinessRoles().getDescription());
        businessRoles.setInsert_by(updateOfficeDto.getBusinessRoles().getInsert_by());
        businessRoles.setInsert_date(updateOfficeDto.getBusinessRoles().getInsert_date());
        businessRoles.setModify_by(updateOfficeDto.getBusinessRoles().getModify_by());
        businessRoles.setModify_date(LocalDateTime.now(ZoneOffset.UTC));
        businessRolesRepository.save(businessRoles);
        office.setBusinessRoles(businessRoles);
        return office;
    }
}
