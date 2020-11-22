package com.antonio.connectabackend.services.employee;

import com.antonio.connectabackend.models.dto.employee.UpdateEmployeeDto;

import java.util.UUID;

public interface EmployeeUpdater {
    void update(UUID id, UpdateEmployeeDto updateEmployeeDto);
}
