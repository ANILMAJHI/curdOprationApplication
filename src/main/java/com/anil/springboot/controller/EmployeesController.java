package com.anil.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anil.springboot.model.Employees;
import com.anil.springboot.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeesController {

	@Autowired
	EmployeeService serviceRepository;

	@GetMapping("/msg")
	public String getMessage() {
		return "hello messgae";
	}

	@GetMapping("/empl")
	public List<Employees> getAllEmp() {
		return serviceRepository.findAll();
	}

	@PostMapping("/post")
	public Employees addEmployees(@RequestBody Employees employees) {

		return (Employees) serviceRepository.save(employees);

		//return (Employees) serviceRepository.findAll();
	}

}
