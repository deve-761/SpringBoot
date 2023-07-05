package com.realtech.organizationservice.controller;

import com.realtech.organizationservice.dto.OrganizationDto;
import com.realtech.organizationservice.entity.Organization;
import com.realtech.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/organizations")
public class OrganizationController {
    private OrganizationService organizationService;

    @PostMapping
    public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto){
        OrganizationDto savedOrganizationDto=organizationService.saveOrganization(organizationDto);
        return new ResponseEntity<>(savedOrganizationDto, HttpStatus.CREATED);
    }

    @GetMapping("{organizationCode}")
    public ResponseEntity<OrganizationDto> getOrganization(@PathVariable String organizationCode){
        OrganizationDto savedOrganization=organizationService.getOrganizationByCode(organizationCode);
        return new ResponseEntity<>(savedOrganization,HttpStatus.OK);
    }
}
