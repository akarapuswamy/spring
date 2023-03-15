package com.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.pojo.Employee;
import com.queries.EmployeeQueries;

public class EmployeeImpTemplete implements EmployeeDao {
	
	
	private JdbcTemplate jdbctemp;
	
	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}

	public int save(Employee emp) {
		System.out.println("anntion class....");
		String insert ="insert into employee values(?,?,?,?)";
		Object [] emps ={emp.getId(),emp.getName(),emp.getSalary(),emp.getAddress()};
		int results = jdbctemp.update(insert,emps);
		return results;
	}
		

	public void update(Employee update) {
		
		
	}

	public void delect(Integer id) {
	
		
	}

	public List<Employee> GetAllEmployee() {
		
		return null;
	}

}
