package com.anil.springboot.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anil.springboot.model.Employees;

@Repository
public interface EmployeeService extends JpaRepository<Employees, Integer>{

	
	
}
