package com.imaginnovate.Dto;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class EmployeeRequestDto {
	private Long employeeId;
	
	@NotNull
	@Size(min=3,message="FirstName should have atleast 3 characters")
    private String firstName;

   
    private String lastName;

    
    private String email;

    
    private List<String> phoneNumbers;

   
    private String doj;

   private double salary;
   
   

public Long getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(Long employeeId) {
	this.employeeId = employeeId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public List<String> getPhoneNumbers() {
	return phoneNumbers;
}

public void setPhoneNumbers(List<String> phoneNumbers) {
	this.phoneNumbers = phoneNumbers;
}

public String getDoj() {
	return doj;
}

public void setDoj(String doj) {
	this.doj = doj;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}
   
   
   

}
