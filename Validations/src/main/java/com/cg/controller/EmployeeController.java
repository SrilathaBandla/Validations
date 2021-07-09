package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.Employee;
import com.cg.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/GetAllDetails")
	public List<Employee> getAllEmployees(){
		return service.getAllEmployee();
		
	}
	
	@PostMapping("/addEmployee")
	public String addEmployee(@Valid @RequestBody Employee employee) {
		return service.addEmployee(employee);
		}
	
}
