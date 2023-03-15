package com.dao;

import java.util.List;

import com.pojo.Person;

public interface PersonDao {
	
	 int save(Person person);
	
	void update(Person update);
	
	void delect(int id);
	
	List<Person> getAll();
	
}
