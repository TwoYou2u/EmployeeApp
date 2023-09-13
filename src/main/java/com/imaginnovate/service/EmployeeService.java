package com.imaginnovate.service;

import java.util.List;

import com.imaginnovate.Dto.EmployeeRequestDto;
import com.imaginnovate.Dto.EmployeeResponse;
import com.imaginnovate.entity.Employee;

public interface EmployeeService {

public Employee saveEmployee(EmployeeRequestDto empReqDto);

public List<EmployeeResponse> getAllEmployees();


}
