package com.anil.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.anil.springboot.service.AddressService;
import com.anil.springboot.service.EmployeeService;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.anil.springboot.service")
public class CurdOprationApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private AddressService addressService;

	public static void main(String[] args) {
		SpringApplication.run(CurdOprationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		employeeService.deleteAllInBatch();
		addressService.deleteAllInBatch();
	}

}
