package com.anil.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anil.springboot.model.Address;
import com.anil.springboot.model.Employees;
import com.anil.springboot.service.AddressService;
import com.anil.springboot.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeesController {

	@Autowired
	EmployeeService serviceRepository;
	@Autowired
	private AddressService addressService;

	@GetMapping("/msg")
	public String getMessage() {
		return "hello messgae";
	}

	@GetMapping("/getAlladdress")
	public List<Address> getAllEmp() {

		List<Address> address = addressService.findAll();
		return address;
	}

	@PostMapping("/post")
	public Employees addEmployees(@RequestBody Employees employees) {

		return (Employees) serviceRepository.save(employees);

		// return (Employees) serviceRepository.findAll();
	}

	@PostMapping("/postaddress")
	public Address addAddress(@RequestBody Address address) {

		return (Address) addressService.save(address);

		// return (Employees) serviceRepository.findAll();
	}

}
