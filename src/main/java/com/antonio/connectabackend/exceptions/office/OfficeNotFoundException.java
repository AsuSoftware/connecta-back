package com.antonio.connectabackend.exceptions.office;

public class OfficeNotFoundException extends OfficeException {
    public OfficeNotFoundException() {
        super("Office not found");
    }
}
