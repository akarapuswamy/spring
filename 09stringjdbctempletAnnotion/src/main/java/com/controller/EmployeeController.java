package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pojo.Employee;
import com.service.EmployeeServiceImp;
@Controller("abc")
public class EmployeeController  {

	@Autowired
	private EmployeeServiceImp empserviceimp;
	
	public int insert(Employee employee) {
		return empserviceimp.save(employee);
	}
	public ArrayList<Employee> getall() {
		return empserviceimp.AllEmps();
		
	
	}
}
