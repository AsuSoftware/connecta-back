package com.antonio.connectabackend.models.dto.businessRoles;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class UpdateBusinessRolesDto {

    private UUID id;
    private String description;
    private String insert_by;
    private LocalDateTime insert_date;
    private String modify_by;
    private LocalDateTime modify_date;
    private String deleted_by;
    private LocalDateTime deleted_date;
}
