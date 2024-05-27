package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmpService {

	public Employee saveEmployee(Employee emp);
	public List<Employee> getAllEmployee();
}
