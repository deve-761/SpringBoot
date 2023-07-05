package com.realtech.organizationservice.service;

import com.realtech.organizationservice.dto.OrganizationDto;
import com.realtech.organizationservice.entity.Organization;
import com.realtech.organizationservice.repository.OrganizationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.realtech.organizationservice.mapper.OrganizationMapper.MAPPER;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService{

    private OrganizationRepository  organizationRepository;
    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        Organization organization = MAPPER.mapToOrganization(organizationDto);
        Organization savedOrganization=organizationRepository.save(organization);
        OrganizationDto savedOrganizationDto = MAPPER.mapToOrganizationDto(organization);
        return savedOrganizationDto;
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
       Organization savedOrganization= organizationRepository.findByOrganizationCode(organizationCode);
        OrganizationDto savedOrganizationDto = MAPPER.mapToOrganizationDto(savedOrganization);
        return savedOrganizationDto;
    }
}
