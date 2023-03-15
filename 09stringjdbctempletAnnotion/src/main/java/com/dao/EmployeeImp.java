package com.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.pojo.Employee;
import com.queries.EmployeeQueries;
@Repository
public class EmployeeImp implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbctemp;
	
	
	public int save(Employee emp) {
		System.out.println("Employee Annotion Program.....");
		String insert ="insert into employee values(?,?,?,?)";
		Object [] emps ={emp.getId(),emp.getName(),emp.getSalary(),emp.getAddress()};
		int results = jdbctemp.update(insert,emps);
		return results;
	}
		

	public void update(Employee update) {
		
		
	}

	public void delect(int id) {
		
	
		
	}

	public List<Employee> GetAllEmployee() {
		return null;
		}
	public ArrayList<Employee> AllEmps() {
		return (ArrayList<Employee>) jdbctemp.query(EmployeeQueries.getall,new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e1 = new Employee();
				e1.setId(rs.getInt(1));
				e1.setName(rs.getString(2));
				e1.setAddress(rs.getString(3));
				e1.setSalary(rs.getDouble(4));
				return e1;
			}

			
			
		});	
	}
}