package com.antonio.connectabackend.models.dto.companyAreas;

import com.antonio.connectabackend.models.CompanyAreas;
import com.antonio.connectabackend.models.dto.office.OfficeDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Setter
@Getter
public class CompanyAreasDto {

    private UUID id;
    private String name;
    private String description;
    private String insert_by;
    private LocalDateTime insert_date;
    private String modify_by;
    private LocalDateTime modify_date;
    private String deleted_by;
    private LocalDateTime deleted_date;
    private OfficeDto office;

    public static CompanyAreasDto mapFromEntity(CompanyAreas companyAreas) {
        CompanyAreasDto companyAreasDto = new CompanyAreasDto();
        companyAreasDto.setId(companyAreas.getId());
        companyAreasDto.setName(companyAreas.getName());
        companyAreasDto.setDescription(companyAreas.getDescription());
        companyAreasDto.setInsert_by(companyAreas.getInsert_by());
        companyAreasDto.setInsert_date(companyAreas.getInsert_date());
        companyAreasDto.setModify_by(companyAreas.getModify_by());
        companyAreasDto.setModify_date(companyAreas.getModify_date());
        companyAreasDto.setDeleted_by(companyAreas.getDeleted_by());
        companyAreasDto.setDeleted_date(companyAreas.getDeleted_date());
        companyAreasDto.setOffice(OfficeDto.mapFromEntity(companyAreas.getOffice()));
        return companyAreasDto;
    }
}
