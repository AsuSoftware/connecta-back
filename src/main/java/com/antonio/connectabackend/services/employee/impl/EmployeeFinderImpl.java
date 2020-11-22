package com.antonio.connectabackend.services.employee.impl;

import com.antonio.connectabackend.exceptions.employee.EmployeeNotFoundException;
import com.antonio.connectabackend.models.Employee;
import com.antonio.connectabackend.repositories.EmployeeRepository;
import com.antonio.connectabackend.services.employee.EmployeeFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeFinderImpl implements EmployeeFinder {

    private final EmployeeRepository employeeRepository;

    @Override
    public Employee findById(UUID id) {
        return employeeRepository.findById(id).orElseThrow(EmployeeNotFoundException::new);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
