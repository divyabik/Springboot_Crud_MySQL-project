package com.divya.springboot.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.divya.springboot.employeemanagementsystem.model.Employee;
import com.divya.springboot.employeemanagementsystem.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empser;
	
	@PostMapping("/addEmployee")
	public Employee addEmp(@RequestBody Employee emp) {
		return empser.saveEmp(emp);
	}
	
	@PostMapping("/addEmployees")
	public List<Employee> addEmps(@RequestBody List<Employee> emps) {
		return empser.saveEmps(emps);
	}
	
	@GetMapping("/employees")
	public List<Employee> findAllEmps(){
		return empser.getEmps();
	}
	
	@GetMapping("/employeeById/{id}")
	public Employee findEmpById(@PathVariable int id){
		return empser.getEmpById(id);
	}
	
	@GetMapping("/employee/{name}")
	public Employee findEmpByName(@PathVariable String name){
		return empser.getEmpByName(name);
	}
	
	@PutMapping("/update")
	public Employee updateEmp(@RequestBody Employee emp){
		return empser.updateEmp(emp);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmp(@PathVariable int id){
		return empser.deleteEmp(id);
		
	}
	
	
	
	
	
	
	

}
