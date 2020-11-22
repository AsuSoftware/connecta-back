package com.antonio.connectabackend.services.employee.impl;

import com.antonio.connectabackend.models.dto.employee.CreateEmployeeDto;
import com.antonio.connectabackend.models.dto.employee.EmployeeDto;
import com.antonio.connectabackend.models.dto.employee.UpdateEmployeeDto;
import com.antonio.connectabackend.services.employee.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeCreator employeeCreator;
    private final EmployeeUpdater employeeUpdater;
    private final EmployeeFinder employeeFinder;
    private final EmployeeRemoval employeeRemoval;

    @Override
    public void register(CreateEmployeeDto createEmployeeDto) {
    System.out.println("Test 2 " + createEmployeeDto);
        employeeCreator.create(createEmployeeDto);
    }

    @Override
    public void update(UUID id, UpdateEmployeeDto updateEmployeeDto) {
        employeeUpdater.update(id, updateEmployeeDto);
    }

    @Override
    public List<EmployeeDto> findAll() {
    return employeeFinder.findAll().stream()
        .map(EmployeeDto::mapFromEntity)
        .collect(Collectors.toList());
    }

    @Override
    public void delete(UUID id) {
       employeeRemoval.delete(id);
    }
}
