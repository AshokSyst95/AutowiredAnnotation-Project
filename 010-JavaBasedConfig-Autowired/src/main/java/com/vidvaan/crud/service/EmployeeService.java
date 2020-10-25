package com.vidvaan.crud.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.vidvaan.crud.dao.EmployeeDao;

public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public void save() {
		System.out.println("EmployeeService save is called");
		employeeDao.save();
	}
}
