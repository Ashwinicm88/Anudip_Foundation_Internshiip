package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmpRepository;

@Service
public class EmpServiceImp implements EmpService{

	@Autowired
	private EmpRepository empRepository;
	
	@Override
	public Employee saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return empRepository.save(emp);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empRepository.findAll();
	}
	
}
