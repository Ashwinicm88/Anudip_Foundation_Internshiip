package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmpService;

@RestController
@RequestMapping("/Emp")
public class EmployeeController 
{
	@Autowired
	private EmpService empService;
	
	@PostMapping("/add")
	public String add(@RequestBody Employee emp) 
	{
		
		empService.saveEmployee(emp);
		
		return "New Employee added";
	}
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee(){
		return empService.getAllEmployee();
	}
}
