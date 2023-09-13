package com.imaginnovate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imaginnovate.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
