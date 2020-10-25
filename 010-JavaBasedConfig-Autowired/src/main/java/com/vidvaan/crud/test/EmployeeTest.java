package com.vidvaan.crud.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vidvaan.crud.config.SpringConfig;
import com.vidvaan.crud.controller.EmployeeController;

public class EmployeeTest {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		EmployeeController controller = (EmployeeController) context.getBean("employeeController");
		controller.save();
	}
}
