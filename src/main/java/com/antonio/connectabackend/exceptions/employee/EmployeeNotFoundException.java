package com.antonio.connectabackend.exceptions.employee;

public class EmployeeNotFoundException extends EmployeeException {
    public EmployeeNotFoundException() {
        super("Employee not found");
    }
}
