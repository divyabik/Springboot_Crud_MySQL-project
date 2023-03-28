package com.divya.springboot.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divya.springboot.employeemanagementsystem.model.Employee;
import com.divya.springboot.employeemanagementsystem.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository emprep;
	
	public Employee saveEmp(Employee emp) {
		return emprep.save(emp);
	}
	
	public List<Employee> saveEmps(List<Employee> emps){
		return emprep.saveAll(emps);
	}
	
	
	public List<Employee> getEmps(){
		return emprep.findAll();
	}
	
	public Employee getEmpById(int id) {
		return emprep.findById(id).orElse(null);
	}
	
	public Employee getEmpByName(String name) {
		return emprep.findByName(name);
	}
	
	public String deleteEmp(int id) {
		emprep.deleteById(id);
		return "Employee Removed ||" +id;
		
	}
	
	public Employee updateEmp(Employee emp) {
		Employee exemp=emprep.findById(emp.getId()).orElse(null);
		exemp.setName(emp.getName());
		exemp.setDept(emp.getDept());
		exemp.setSalary(emp.getSalary());
		return emprep.save(exemp);
	}
	
	
	
	
	
	
	
	
	

}
