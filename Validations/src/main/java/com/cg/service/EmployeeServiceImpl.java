package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.EmployeeEntity;
import com.cg.dao.EmployeeRespository;
import com.cg.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRespository repository;

	@Override
	public List<Employee> getAllEmployee() {
	    List<EmployeeEntity> entityList = repository.findAll();
		List<Employee> empList = new ArrayList<>();
		for(EmployeeEntity entity: entityList) {
			Employee employee = new Employee();
			employee.setEmpId(entity.getEmpId());
			employee.setEmpName(entity.getEmpName());
			employee.setGender(entity.getGender());
			employee.setAdress(entity.getAdress());
			employee.setContactNumber(entity.getContactNumber());
		//	employee.setDateOfBirth(entity.getDateOfBirth());
			empList.add(employee);
		}
		
		return empList;
	}

	@Override
	public String addEmployee(Employee employee) {
		
		EmployeeEntity entity = new EmployeeEntity();
		entity.setEmpId(employee.getEmpId());
		entity.setEmpName(employee.getEmpName());
		entity.setAdress(employee.getAdress());
		entity.setGender(employee.getGender());
		entity.setContactNumber(employee.getContactNumber());
		repository.saveAndFlush(entity);
		return "New Employee Added Succesfully";
	}
//return repository.findAll();
}
