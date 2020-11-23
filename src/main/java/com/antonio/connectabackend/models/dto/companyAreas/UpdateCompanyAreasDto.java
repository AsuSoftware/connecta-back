package com.antonio.connectabackend.models.dto.companyAreas;

import com.antonio.connectabackend.models.dto.office.OfficeDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class UpdateCompanyAreasDto {
    private UUID id;
    private String name;
    private String description;
    private String insert_by;
    private LocalDateTime insert_date;
    private String modify_by;
    private LocalDateTime modify_date;
    private OfficeDto office;
}
