package com.antonio.connectabackend.models.dto.employee;

import com.antonio.connectabackend.models.Employee;
import com.antonio.connectabackend.models.Office;
import com.antonio.connectabackend.models.dto.businessRoles.BusinessRolesDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class EmployeeDto {
    private UUID id;
    private String name;
    private String surname;
    private String phone;
    private String mobile;
    private String email;
    private String active;
    private String note;
    private String insert_by;
    private LocalDateTime insert_date;
    private String modify_by;
    private LocalDateTime modify_date;
    private String deleted_by;
    private LocalDateTime deleted_date;
    private Office office;
    private BusinessRolesDto businessRoles;

    public static EmployeeDto mapFromEntity(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        employeeDto.setSurname(employee.getSurname());
        employeeDto.setPhone(employee.getPhone());
        employeeDto.setMobile(employee.getMobile());
        employeeDto.setEmail(employee.getEmail());
        employeeDto.setActive(employee.getActive());
        employeeDto.setNote(employee.getNote());
        employeeDto.setInsert_by(employee.getInsert_by());
        employeeDto.setInsert_date(employee.getInsert_date());
        employeeDto.setModify_by(employee.getModify_by());
        employeeDto.setModify_date(employee.getModify_date());
        employeeDto.setDeleted_by(employee.getDeleted_by());
        employeeDto.setDeleted_date(employee.getDeleted_date());
       // employeeDto.setOffice(employee.getOffice());
       // employeeDto.setBusinessRoles(BusinessRolesDto.mapFromEntity(employee.getBusinessRoles()));
        return employeeDto;
    }
}
