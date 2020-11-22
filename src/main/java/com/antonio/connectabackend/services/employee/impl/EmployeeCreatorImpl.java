package com.antonio.connectabackend.services.employee.impl;

import com.antonio.connectabackend.models.Employee;
import com.antonio.connectabackend.models.dto.employee.CreateEmployeeDto;
import com.antonio.connectabackend.repositories.EmployeeRepository;
import com.antonio.connectabackend.services.employee.EmployeeCreator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
@RequiredArgsConstructor
public class EmployeeCreatorImpl implements EmployeeCreator {

    private final EmployeeRepository employeeRepository;
   // private final OfficeServiceImpl officeService;
    // private final BusinessRolesServiceImpl businessRolesService;

    @Override
    public void create(CreateEmployeeDto employeeDto) {
        Employee employee = createEmployee(employeeDto);
        Employee employeeSaved = employeeRepository.save(employee);
       // officeService.register(employeeDto.getCreateOfficeDto(), employeeSaved);
       // businessRolesService.register(employeeDto.getBusinessRoles());
    }

    private Employee createEmployee(CreateEmployeeDto createEmployeeDto) {
        Employee employee = new Employee();
        employee.setName(createEmployeeDto.getName());
        employee.setSurname(createEmployeeDto.getSurname());
        employee.setEmail(createEmployeeDto.getEmail());
        employee.setPhone(createEmployeeDto.getPhone());
        employee.setMobile(createEmployeeDto.getMobile());
        employee.setActive(createEmployeeDto.getActive());
        employee.setInsert_by(createEmployeeDto.getInsert_by());
        employee.setInsert_date(LocalDateTime.now(ZoneOffset.UTC));
        /*
        BusinessRoles businessRoles = new BusinessRoles();
        businessRoles.setDescription(createEmployeeDto.getBusinessRoles().getDescription());
        businessRoles.setInsert_by(createEmployeeDto.getInsert_by());
        employee.setBusinessRoles(businessRoles); */
        /*
        Office office = new Office();
        office.setName(createEmployeeDto.getCreateOfficeDto().getName());
        office.setAddress(createEmployeeDto.getCreateOfficeDto().getAddress());
        office.setDistrict(createEmployeeDto.getCreateOfficeDto().getDistrict());
        office.setPostal_code(createEmployeeDto.getCreateOfficeDto().getPostal_code());
        office.setLocality(createEmployeeDto.getCreateOfficeDto().getLocality());
        office.setCity(createEmployeeDto.getCreateOfficeDto().getCity());
        office.setVat(createEmployeeDto.getCreateOfficeDto().getVat());
        office.setPhone(createEmployeeDto.getCreateOfficeDto().getPhone());
        office.setPec(createEmployeeDto.getCreateOfficeDto().getPec());
        office.setEmail(createEmployeeDto.getCreateOfficeDto().getEmail());
        office.setInsert_by(createEmployeeDto.getCreateOfficeDto().getInsert_by()); */
        return employee;
    }
}
