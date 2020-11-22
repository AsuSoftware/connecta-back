package com.antonio.connectabackend.models.dto.office;

import com.antonio.connectabackend.models.Office;
import com.antonio.connectabackend.models.dto.businessRoles.BusinessRolesDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class OfficeDto {

    private UUID id;
    private String name;
    private String address;
    private String district;
    private String postal_code;
    private String locality;
    private String city;
    private String vat;
    private String phone;
    private String pec;
    private String email;
    private String insert_by;
    private LocalDateTime insert_date;
    private String modify_by;
    private LocalDateTime modify_date;
    private String deleted_by;
    private LocalDateTime deleted_date;
    private BusinessRolesDto businessRoles;

    public static OfficeDto mapFromEntity(Office office) {
        OfficeDto officeDto = new OfficeDto();
        officeDto.setId(office.getId());
        officeDto.setName(office.getName());
        officeDto.setAddress(office.getAddress());
        officeDto.setDistrict(office.getDistrict());
        officeDto.setPostal_code(office.getPostal_code());
        officeDto.setLocality(office.getLocality());
        officeDto.setCity(office.getCity());
        officeDto.setVat(office.getVat());
        officeDto.setPhone(office.getPhone());
        officeDto.setPec(office.getPec());
        officeDto.setEmail(office.getEmail());
        officeDto.setInsert_by(office.getInsert_by());
        officeDto.setInsert_date(office.getInsert_date());
        officeDto.setBusinessRoles(BusinessRolesDto.mapFromEntity(office.getBusinessRoles()));
        return officeDto;
    }
}
