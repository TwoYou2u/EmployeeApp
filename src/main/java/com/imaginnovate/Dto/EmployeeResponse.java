package com.imaginnovate.Dto;


public class EmployeeResponse {
	

	private Long employeeCode;

    private String firstName;

    private String lastName;
    
    private Double YearlySalary;
    
    private Double taxAmount;
    
    private Double cessAmount;

	public Long getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(Long employeeCode) {
		this.employeeCode = employeeCode;
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

	public Double getYearlySalary() {
		return YearlySalary;
	}

	public void setYearlySalary(Double yearlySalary) {
		YearlySalary = yearlySalary;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public Double getCessAmount() {
		return cessAmount;
	}

	public void setCessAmount(Double cessAmount) {
		this.cessAmount = cessAmount;
	}
    
    
    

   
}
