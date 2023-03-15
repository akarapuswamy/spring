package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.pojo.Student;

public class StudentTemplate implements StudentDao {
	
    private JdbcTemplate jdbctemp;
    
	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}

	public int save(Student stu) {
	 String insert ="insert into Student values(?,?,?,?)";
	 Object [] emps = {stu.getId(),stu.getName(),stu.getEmail(),stu.getAddress()};
	 int results =jdbctemp.update(insert,emps);
	 return results;
		
	}
	
	public void update(Student update) {
	
		
		
	}
	public void delect(Integer id) {
		
		
	}
	public List<Student> Find_all(Student findall) {
		
		
		return null;
	}

}
