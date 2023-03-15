package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Employee;

public interface EmployeeDao {
	
	 int save(Employee emp);

	 void update(Employee update);

	 void delect(int id);

	List<Employee> GetAllEmployee();
	
	ArrayList<Employee> AllEmps();

}
