package com.antonio.connectabackend.exceptions;

public class EmployeeNotFoundException extends EmployeeException {
    public EmployeeNotFoundException() {
        super("Employee not found");
    }
}
