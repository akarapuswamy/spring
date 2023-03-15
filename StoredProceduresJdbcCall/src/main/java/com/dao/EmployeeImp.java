package com.dao;

import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.pojo.Employee;

public class EmployeeImp implements EmployeeDao {
	
	private JdbcTemplate JdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		JdbcTemplate = jdbcTemplate;
	}


	public void SelectEmployee(int id) {
		SimpleJdbcCall si= new SimpleJdbcCall(JdbcTemplate).withProcedureName("SelectEmployee");
		MapSqlParameterSource mapsql = new MapSqlParameterSource();
		mapsql.addValue("E_id", id);
		Map<String, Object> results =si.execute(mapsql);
		System.out.println(results);
	}


	public void EmployeeInsert(Employee emp) {
		SimpleJdbcCall si= new SimpleJdbcCall(JdbcTemplate).withProcedureName("EmployeeInsert");
		MapSqlParameterSource sql = new MapSqlParameterSource();
		sql.addValue("id", emp.getId());
		sql.addValue("EmpName", emp.getEmpName());
		sql.addValue("salary", emp.getSalary());
		sql.addValue("Address", emp.getAddress());
		System.out.println(sql);
	}


	public void Emp_delect(int id) {
		SimpleJdbcCall si= new SimpleJdbcCall(JdbcTemplate).withProcedureName("delect");
		MapSqlParameterSource mapsqlpara = new MapSqlParameterSource();
		mapsqlpara.addValue("id", id);

	}




	
}
