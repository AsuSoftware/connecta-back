package com.antonio.connectabackend.services.employee;

import com.antonio.connectabackend.models.Employee;

import java.util.List;
import java.util.UUID;

public interface EmployeeFinder {

    Employee findById(UUID id);
    List<Employee> findAll();
}
