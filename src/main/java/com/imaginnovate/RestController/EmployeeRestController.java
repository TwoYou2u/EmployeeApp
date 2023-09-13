package com.imaginnovate.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imaginnovate.Dto.EmployeeRequestDto;
import com.imaginnovate.Dto.EmployeeResponse;
import com.imaginnovate.constants.Constants;
import com.imaginnovate.entity.Employee;
import com.imaginnovate.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/employeeSave")
	public ResponseEntity<String> saveEmployeeData(@Valid @RequestBody EmployeeRequestDto empReqDto){
		String status;
		Employee emp=empService.saveEmployee(empReqDto);
		
		if(emp!=null) {
			
			status=Constants.SAVE_SUCESS;
		}else {
			
			status=Constants.SAVE_FAIL;
		}
		
		return new ResponseEntity<String>(status,HttpStatus.OK);
	}
	
	
	
     @GetMapping("/employees")
	
	public ResponseEntity<?> getAllEmployees(){
		
    	 List<EmployeeResponse> listEmpRes=empService.getAllEmployees();
    	 
    	
    	 if(!listEmpRes.isEmpty()) {
		
		return new ResponseEntity(listEmpRes,HttpStatus.OK);
		
    	 }else {
    		 
    	return new ResponseEntity(Constants.DATANOT_AVAILABLE,HttpStatus.OK);
    		 
    	 }
		
		
	}
	
	
	

}
