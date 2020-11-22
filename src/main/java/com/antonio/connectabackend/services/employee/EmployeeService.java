package com.antonio.connectabackend.services.employee;


import com.antonio.connectabackend.models.dto.employee.CreateEmployeeDto;
import com.antonio.connectabackend.models.dto.employee.EmployeeDto;
import com.antonio.connectabackend.models.dto.employee.UpdateEmployeeDto;

import java.util.List;
import java.util.UUID;

public interface EmployeeService {

    void register(CreateEmployeeDto createEmployeeDto);

    void update(UUID id, UpdateEmployeeDto updateEmployeeDto);

    List<EmployeeDto> findAll();

    void delete(UUID id);
}
