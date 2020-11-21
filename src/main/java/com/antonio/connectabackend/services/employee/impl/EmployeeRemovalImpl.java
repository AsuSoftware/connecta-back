package com.antonio.connectabackend.services.employee.impl;

import com.antonio.connectabackend.repositories.EmployeeRepository;
import com.antonio.connectabackend.services.employee.EmployeeRemoval;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeRemovalImpl implements EmployeeRemoval {

    private final EmployeeRepository employeeRepository;

    @Override
    public void delete(UUID id) {
        employeeRepository.deleteById(id);
    }
}
