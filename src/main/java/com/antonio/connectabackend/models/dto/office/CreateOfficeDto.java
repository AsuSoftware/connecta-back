package com.antonio.connectabackend.models.dto.office;

import com.antonio.connectabackend.models.dto.businessRoles.CreateBusinessRolesDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class CreateOfficeDto {
    @NotNull
    private String name;
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
    @NotNull private CreateBusinessRolesDto businessRoles;
}
