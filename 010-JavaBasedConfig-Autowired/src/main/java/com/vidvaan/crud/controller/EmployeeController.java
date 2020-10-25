package com.vidvaan.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.vidvaan.crud.service.EmployeeService;

public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	public void save() {
		System.out.println("EmployeeController save is called");
		employeeService.save();
	}
}
