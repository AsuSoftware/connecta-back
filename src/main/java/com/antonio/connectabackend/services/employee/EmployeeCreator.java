package com.antonio.connectabackend.services.employee;

import com.antonio.connectabackend.models.dto.CreateEmployeeDto;

public interface EmployeeCreator {
    void create(CreateEmployeeDto employeeDto);
}
