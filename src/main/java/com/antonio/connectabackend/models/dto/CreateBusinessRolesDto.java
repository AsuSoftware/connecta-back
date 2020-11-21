package com.antonio.connectabackend.models.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class CreateBusinessRolesDto {

    @NotNull private String description;
    @NotNull private String insert_by;
}
