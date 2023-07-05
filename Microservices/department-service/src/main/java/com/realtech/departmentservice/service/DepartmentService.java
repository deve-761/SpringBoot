package com.realtech.departmentservice.service;

import com.realtech.departmentservice.dto.DepartmentDto;
import com.realtech.departmentservice.entity.Department;

public interface DepartmentService {

    DepartmentDto saveDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentByCode(String code);
}
