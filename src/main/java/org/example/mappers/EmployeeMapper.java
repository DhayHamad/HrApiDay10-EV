package org.example.mappers;


import org.example.dto.EmployeesDto;
import org.example.models.Employees;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeMapper {

    EmployeesDto toEmpDto(Employees e);

    Employees toModel(EmployeesDto dto);
}
