package com.cognizant.springdatajpah2db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repository;

	public Employee save(Employee employee) {
		return repository.save(employee);
	}
	
	public List<Employee> findAll(){
		return repository.findAll();
	}

}
