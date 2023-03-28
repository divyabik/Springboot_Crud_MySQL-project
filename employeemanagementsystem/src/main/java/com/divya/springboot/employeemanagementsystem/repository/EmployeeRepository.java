package com.divya.springboot.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divya.springboot.employeemanagementsystem.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	Employee findByName(String name);

}
