package com.antonio.connectabackend.exceptions.companyAreas;

public class CompanyAreasNotFoundException extends CompanyAreasException{
    public CompanyAreasNotFoundException() {
        super("Company area not found");
    }
}
