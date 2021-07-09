package com.cg.service;

import java.util.List;

import com.cg.dto.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployee();
	public String addEmployee(Employee employee);

}
