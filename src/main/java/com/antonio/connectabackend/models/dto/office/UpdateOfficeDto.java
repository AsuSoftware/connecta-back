package com.antonio.connectabackend.models.dto.office;

import com.antonio.connectabackend.models.dto.businessRoles.UpdateBusinessRolesDto;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
public class UpdateOfficeDto {

    @NotNull private String name;
    @NotNull private String address;
    private String district;
    private String postal_code;
    private String locality;
    private String city;
    private String vat;
    private String phone;
    private String pec;
    @Email private String email;
    @NotNull private String insert_by;
    private LocalDateTime insert_date;
    @NotNull private String modify_by;
    private LocalDateTime modify_date;
    @NotNull private UpdateBusinessRolesDto businessRoles;
}
