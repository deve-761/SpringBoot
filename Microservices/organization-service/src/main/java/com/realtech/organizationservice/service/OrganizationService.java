package com.realtech.organizationservice.service;


import com.realtech.organizationservice.dto.OrganizationDto;
import com.realtech.organizationservice.entity.Organization;
import org.aspectj.weaver.ast.Or;

public interface OrganizationService {
    OrganizationDto saveOrganization(OrganizationDto organizationDto);
    OrganizationDto getOrganizationByCode(String organizationCode);
}
