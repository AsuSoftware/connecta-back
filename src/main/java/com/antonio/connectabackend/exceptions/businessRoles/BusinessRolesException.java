package com.antonio.connectabackend.exceptions.businessRoles;

public class BusinessRolesException extends RuntimeException {
    public BusinessRolesException(String message) {
        super(message);
    }

    public BusinessRolesException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessRolesException(Throwable cause) {
        super(cause);
    }

    public BusinessRolesException(
            String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
