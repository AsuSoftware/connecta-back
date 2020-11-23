package com.antonio.connectabackend.controllers;

import com.antonio.connectabackend.models.dto.office.CreateOfficeDto;
import com.antonio.connectabackend.models.dto.office.OfficeDto;
import com.antonio.connectabackend.models.dto.office.UpdateOfficeDto;
import com.antonio.connectabackend.services.office.OfficeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/offices")
public class OfficeController {

    private final OfficeService officeService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@Valid @RequestBody CreateOfficeDto createOfficeDto) {
        officeService.register(createOfficeDto);
    }

    @GetMapping
    //@ResponseStatus(HttpStatus.FOUND)
    public List<OfficeDto> findAllOffices() {
        return officeService.findAll();
    }

    @PutMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateOffice(@PathVariable UUID id, @RequestBody UpdateOfficeDto updateOfficeDto) {
        officeService.update(id, updateOfficeDto);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void removeEmployee(@PathVariable UUID id) {
        officeService.delete(id);
    }
}
