package com.vidvaan.crud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vidvaan.crud.controller.EmployeeController;
import com.vidvaan.crud.dao.EmployeeDao;
import com.vidvaan.crud.service.EmployeeService;

@Configuration
public class SpringConfig {

	@Bean
	public EmployeeDao employeeDao() {
		return new EmployeeDao();
	}

	@Bean
	public EmployeeService employeeService() {
		return new EmployeeService();
	}

	@Bean
	public EmployeeController employeeController() {
		return new EmployeeController();
	}
}
