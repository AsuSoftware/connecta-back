package com.antonio.connectabackend.models.dto.employee;

import com.antonio.connectabackend.models.dto.businessRoles.CreateBusinessRolesDto;
import com.antonio.connectabackend.models.dto.office.CreateOfficeDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@ToString
public class CreateEmployeeDto {
    @NotNull private String name;
    @NotNull private String surname;
    private String phone;
    private String mobile;
    @Email private String email;
    @NotNull private String active;
    @NotNull private String note;
    @NotNull private String insert_by;
    @NotNull private CreateOfficeDto createOfficeDto; // office
    @NotNull private CreateBusinessRolesDto businessRoles; // role
}
