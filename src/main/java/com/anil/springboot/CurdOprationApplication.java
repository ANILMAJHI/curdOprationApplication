package com.anil.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.anil.springboot.service")
public class CurdOprationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdOprationApplication.class, args);
	}

}
