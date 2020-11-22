package com.antonio.connectabackend.exceptions.office;

public class OfficeException extends RuntimeException {
    public OfficeException(String message) {
        super(message);
    }

    public OfficeException(String message, Throwable cause) {
        super(message, cause);
    }

    public OfficeException(Throwable cause) {
        super(cause);
    }

    public OfficeException(
            String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
