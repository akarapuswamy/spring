package com.service;

import java.util.List;

import com.pojo.Person;

public interface PersonService {
	
    int save(Person person);
	
	void update(Person update);
	
	void delect(int id);
	
	List<Person> getAll();


}
