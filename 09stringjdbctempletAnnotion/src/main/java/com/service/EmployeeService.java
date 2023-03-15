package com.service;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Employee;

public interface EmployeeService {
	
	 int save(Employee emp);

	 void update(Employee update);

	 int delect(int id);

	List<Employee> GetAllEmployee();

	ArrayList<Employee> AllEmps();
}
