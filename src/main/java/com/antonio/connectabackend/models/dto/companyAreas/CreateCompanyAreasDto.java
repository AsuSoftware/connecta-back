package com.antonio.connectabackend.models.dto.companyAreas;

import com.antonio.connectabackend.models.dto.office.OfficeDto;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class CreateCompanyAreasDto {

    private String name;
    private String description;
    private String insert_by;
    private Date insert_date;
    private OfficeDto office;
}
