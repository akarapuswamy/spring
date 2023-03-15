package com.dao;

import java.util.List;

import com.pojo.Employee;

public interface EmployeeDao {
	
	 int save(Employee emp);

	 void update(Employee update);

	 void delect(Integer id);

	List<Employee> GetAllEmployee();

}
