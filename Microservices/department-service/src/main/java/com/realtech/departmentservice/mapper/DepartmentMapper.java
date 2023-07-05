package com.realtech.departmentservice.mapper;

import com.realtech.departmentservice.dto.DepartmentDto;
import com.realtech.departmentservice.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DepartmentMapper {

    DepartmentMapper MAPPER = Mappers.getMapper(DepartmentMapper.class);

    Department mapToDepartment(DepartmentDto departmentDto);

    DepartmentDto mapToDepartmentDto(Department department);
}
