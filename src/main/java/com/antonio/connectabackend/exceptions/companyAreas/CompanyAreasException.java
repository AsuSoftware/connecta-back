package com.antonio.connectabackend.exceptions.companyAreas;

public class CompanyAreasException extends RuntimeException {
    public CompanyAreasException(String message) {
        super(message);
    }

    public CompanyAreasException(String message, Throwable cause) {
        super(message, cause);
    }

    public CompanyAreasException(Throwable cause) {
        super(cause);
    }

    public CompanyAreasException(
            String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
