package com.dao;

import com.pojo.Employee;

public interface EmployeeDao {
	
	void SelectEmployee(int id);
	
	void EmployeeInsert(Employee emp);
	
	void Emp_delect(int id);
	

}
