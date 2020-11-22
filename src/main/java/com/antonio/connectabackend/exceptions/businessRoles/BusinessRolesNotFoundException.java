package com.antonio.connectabackend.exceptions.businessRoles;

public class BusinessRolesNotFoundException extends BusinessRolesException {

    public BusinessRolesNotFoundException() {
        super("Business role not found");
    }
}
