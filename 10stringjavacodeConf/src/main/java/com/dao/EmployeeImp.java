package com.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.pojo.Employee;

@Repository("dao")
public class EmployeeImp implements EmployeeDao {
	
		
	public void save(Employee emp) {
		System.out.println(emp);
		System.out.println("employee dao");
		
	}
		

	public void update(Employee update) {
		
		
	}

	public void delect(int id) {
	
		
	}

	public List<Employee> GetAllEmployee() {
		
		return null;
	}

}
