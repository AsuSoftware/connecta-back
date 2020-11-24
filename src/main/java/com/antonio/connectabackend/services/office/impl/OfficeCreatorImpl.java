package com.antonio.connectabackend.services.office.impl;

import com.antonio.connectabackend.models.BusinessRoles;
import com.antonio.connectabackend.models.Office;
import com.antonio.connectabackend.models.dto.office.CreateOfficeDto;
import com.antonio.connectabackend.repositories.OfficeRepository;
import com.antonio.connectabackend.services.business_roles.impl.BusinessRolesServiceImpl;
import com.antonio.connectabackend.services.office.OfficeCreator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
@RequiredArgsConstructor
public class OfficeCreatorImpl implements OfficeCreator {

    private final OfficeRepository officeRepository;
    private final BusinessRolesServiceImpl businessRolesService;

    @Override
    public void create(CreateOfficeDto createOfficeDto) {
        Office office = createOffice(createOfficeDto);
        BusinessRoles businessRoles = businessRolesService.register(createOfficeDto.getBusinessRoles());
        office.setBusinessRoles(businessRoles); // set business role after insert it to db, so it can have the id
        officeRepository.save(office);
    }

    private Office createOffice(CreateOfficeDto createOfficeDto) {
        Office office = new Office();
        office.setName(createOfficeDto.getName());
        office.setAddress(createOfficeDto.getAddress());
        office.setDistrict(createOfficeDto.getDistrict());
        office.setPostal_code(createOfficeDto.getPostal_code());
        office.setLocality(createOfficeDto.getLocality());
        office.setCity(createOfficeDto.getCity());
        office.setVat(createOfficeDto.getVat());
        office.setPhone(createOfficeDto.getPhone());
        office.setPec(createOfficeDto.getPec());
        office.setEmail(createOfficeDto.getEmail());
        office.setInsert_by(createOfficeDto.getInsert_by());
        office.setInsert_date(LocalDateTime.now(ZoneOffset.UTC));
       // office.setEmployees(employee);
        return office;
    }
}
