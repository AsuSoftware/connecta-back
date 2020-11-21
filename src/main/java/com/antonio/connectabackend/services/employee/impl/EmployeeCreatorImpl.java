package com.antonio.connectabackend.services.employee.impl;

import com.antonio.connectabackend.models.BusinessRoles;
import com.antonio.connectabackend.models.Employee;
import com.antonio.connectabackend.models.dto.CreateEmployeeDto;
import com.antonio.connectabackend.repositories.EmployeeRepository;
import com.antonio.connectabackend.services.employee.EmployeeCreator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeCreatorImpl implements EmployeeCreator {

    private final EmployeeRepository employeeRepository;

    @Override
    public void create(CreateEmployeeDto employeeDto) {
        Employee employee = createEmployee(employeeDto);
        employeeRepository.save(employee);
    }

    private Employee createEmployee(CreateEmployeeDto createEmployeeDto) {
        Employee employee = new Employee();
        employee.setName(createEmployeeDto.getName());
        employee.setSurname(createEmployeeDto.getSurname());
        employee.setEmail(createEmployeeDto.getEmail());
        employee.setPhone(createEmployeeDto.getPhone());
        employee.setMobile(createEmployeeDto.getMobile());
        employee.setActive(createEmployeeDto.getActive());
        employee.setInsert_by(createEmployeeDto.getInsert_by());
        employee.setInsert_date(LocalDateTime.now(ZoneOffset.UTC));
        employee.setBusinessRoles(createEmployeeDto.getBusinessRoles().stream().map(createBusinessRolesDto -> {
            BusinessRoles businessRoles = new BusinessRoles();
            businessRoles.setDescription(createBusinessRolesDto.getDescription());
            businessRoles.setInsert_by(createBusinessRolesDto.getInsert_by());
            return businessRoles;
        }).collect(Collectors.toList()));
    System.out.println("Employee " + employee);
        return employee;
    }
}
