package com.antonio.connectabackend.models.dto;

import com.antonio.connectabackend.models.BusinessRoles;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
public class UpdateEmployeeDto {

    @NotNull
    private String name;
    @NotNull private String surname;
    private String phone;
    private String mobile;
    @Email
    private String email;
    @NotNull private String active;
    @NotNull private String note;
    @NotNull private String insert_by;
    @NotNull private String modify_by;
    @NotNull private List<BusinessRoles> businessRoles;
}
