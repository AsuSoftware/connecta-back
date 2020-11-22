package com.antonio.connectabackend.services.employee.impl;

import com.antonio.connectabackend.exceptions.employee.EmployeeNotFoundException;
import com.antonio.connectabackend.models.Employee;
import com.antonio.connectabackend.models.dto.employee.UpdateEmployeeDto;
import com.antonio.connectabackend.repositories.EmployeeRepository;
import com.antonio.connectabackend.services.employee.EmployeeUpdater;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeUpdaterImpl implements EmployeeUpdater {

    private final EmployeeRepository employeeRepository;

    @Override
    public void update(UUID id, UpdateEmployeeDto updateEmployeeDto) {
        Employee employee = employeeRepository.findById(id).orElseThrow(EmployeeNotFoundException::new);
        employee.setName(updateEmployeeDto.getName());
        employee.setSurname(updateEmployeeDto.getSurname());
        employee.setEmail(updateEmployeeDto.getEmail());
        employee.setPhone(updateEmployeeDto.getPhone());
        employee.setMobile(updateEmployeeDto.getMobile());
        employee.setActive(updateEmployeeDto.getActive());
        employee.setInsert_by(updateEmployeeDto.getInsert_by());
        employee.setModify_by(updateEmployeeDto.getModify_by());
        employee.setInsert_date(LocalDateTime.now(ZoneOffset.UTC));
        employee.setModify_date(LocalDateTime.now(ZoneOffset.UTC));
        // employee.setBusinessRoles(updateEmployeeDto.getBusinessRoles());
        employeeRepository.save(employee);
    }
}
