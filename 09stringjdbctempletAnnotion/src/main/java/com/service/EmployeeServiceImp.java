package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeImp;
import com.pojo.Employee;
@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	private EmployeeImp empImp;

	public int save(Employee emp) {
		return empImp.save(emp);
	}

	public void update(Employee update) {
		// TODO Auto-generated method stub
		
	}

	public int delect(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Employee> GetAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Employee> AllEmps() {
		
		return empImp.AllEmps();
	}

	
	
	
	
}
