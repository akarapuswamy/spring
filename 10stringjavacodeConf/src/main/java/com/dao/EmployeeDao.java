package com.dao;

import java.util.List;

import com.pojo.Employee;

public interface EmployeeDao {
	
	 void save(Employee emp);

	 void update(Employee update);

	 void delect(int id);

	List<Employee> GetAllEmployee();

}
