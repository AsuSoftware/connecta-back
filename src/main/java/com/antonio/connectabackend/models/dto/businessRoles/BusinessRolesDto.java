package com.antonio.connectabackend.models.dto.businessRoles;


import com.antonio.connectabackend.models.BusinessRoles;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class BusinessRolesDto {

    private UUID id;
    private String description;
    private String insert_by;
    private LocalDateTime insert_date;
    private String modify_by;
    private LocalDateTime modify_date;
    private String deleted_by;
    private LocalDateTime deleted_date;

    public static BusinessRolesDto mapFromEntity(BusinessRoles businessRoles) {
        BusinessRolesDto businessRolesDto = new BusinessRolesDto();
        businessRolesDto.setId(businessRoles.getId());
        businessRolesDto.setDescription(businessRoles.getDescription());
        businessRolesDto.setInsert_by(businessRoles.getInsert_by());
        businessRolesDto.setInsert_date(businessRoles.getInsert_date());
        businessRolesDto.setModify_by(businessRoles.getModify_by());
        businessRolesDto.setModify_date(businessRoles.getModify_date());
        businessRolesDto.setDeleted_by(businessRoles.getDeleted_by());
        businessRolesDto.setDeleted_date(businessRoles.getDeleted_date());
        return businessRolesDto;
    }
}
