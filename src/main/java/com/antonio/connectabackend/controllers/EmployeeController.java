package com.antonio.connectabackend.controllers;

import com.antonio.connectabackend.models.dto.employee.CreateEmployeeDto;
import com.antonio.connectabackend.models.dto.employee.EmployeeDto;
import com.antonio.connectabackend.models.dto.employee.UpdateEmployeeDto;
import com.antonio.connectabackend.services.employee.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@Valid @RequestBody CreateEmployeeDto createEmployeeDto) {
    System.out.println("Test " + createEmployeeDto);
        employeeService.register(createEmployeeDto);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<EmployeeDto> findAllEmployees() {
        return employeeService.findAll();
    }

    @PutMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateEmployee(@PathVariable UUID id, @RequestBody UpdateEmployeeDto updateEmployeeDto) {
        employeeService.update(id, updateEmployeeDto);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void removeEmployee(@PathVariable UUID id) {
        employeeService.delete(id);
    }
}
