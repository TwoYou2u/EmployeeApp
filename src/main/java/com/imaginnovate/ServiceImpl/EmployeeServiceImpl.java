package com.imaginnovate.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginnovate.Dto.EmployeeRequestDto;
import com.imaginnovate.Dto.EmployeeResponse;
import com.imaginnovate.Repository.EmployeeRepository;
import com.imaginnovate.Util.TaxcalculateUtil;
import com.imaginnovate.entity.Employee;
import com.imaginnovate.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public Employee saveEmployee(EmployeeRequestDto empReqDto) {
		// TODO Auto-generated method stub
		
		Employee employee=DtoTOEmpConversion(empReqDto);
		return empRepo.save(employee);
	}


	@Override
	public List<EmployeeResponse> getAllEmployees() {
		List<Employee> empList=empRepo.findAll();
		
		
		return empToDtoConversion(empList);
	}
	
	private List<EmployeeResponse> empToDtoConversion(List<Employee> listEmp){
		
		List<EmployeeResponse> listEmpRes=new ArrayList<EmployeeResponse>();
		
		for(Employee employee:listEmp) {
			
			EmployeeResponse empRes=new EmployeeResponse();
			empRes.setEmployeeCode(employee.getEmployeeId());
			empRes.setFirstName(employee.getFirstName());
			empRes.setLastName(employee.getLastName());
			double yearlySal=TaxcalculateUtil.calculateAnnualSalary(employee);
			empRes.setYearlySalary(yearlySal);
			empRes.setTaxAmount(TaxcalculateUtil.calculateTaxAmount(yearlySal));
			empRes.setCessAmount(TaxcalculateUtil.calculateCessAmount(yearlySal));
			
			listEmpRes.add(empRes);
			
		}
		
		
		return listEmpRes;
		
	}
	
	
	private Employee DtoTOEmpConversion(EmployeeRequestDto empReqDto){
		
		Employee emp=new Employee();
		emp.setEmployeeId(empReqDto.getEmployeeId());
		emp.setFirstName(empReqDto.getFirstName());
		emp.setLastName(empReqDto.getLastName());
		emp.setEmail(empReqDto.getEmail());
		emp.setPhoneNumbers(empReqDto.getPhoneNumbers());
		emp.setDoj(empReqDto.getDoj());
		emp.setSalary(empReqDto.getSalary());
		
		return emp;
		
		
		
	}
	
	
	
	
	
	

	
}
