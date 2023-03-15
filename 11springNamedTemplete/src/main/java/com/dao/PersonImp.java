package com.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pojo.Person;
import com.queries.PersonQueries;
@Repository
public class PersonImp implements PersonDao {
	@Autowired
	private NamedParameterJdbcTemplate NamedParameter;
	
	
	public int save(Person person) {
		System.out.println("NamedParameterJdbcTemplate progrom....!");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", person.getId());
		map.put("name", person.getName());
		map.put("address", person.getAddress());
		System.out.println("inserted...");
		return NamedParameter.update(PersonQueries.Insert, map);
		
	}

	public void update(Person update) {
		// TODO Auto-generated method stub
		
	}

	public void delect(int id) {
		// TODO Auto-generated method stub
		
	}

	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
