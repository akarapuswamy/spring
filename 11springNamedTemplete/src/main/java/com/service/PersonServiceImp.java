package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.dao.PersonImp;
import com.pojo.Person;
@Service
public class PersonServiceImp implements PersonService {
	@Autowired
	private PersonImp personImp;

	
	public int save(Person person) {
		return personImp.save(person);	
	}

	public void update(Person update) {
		personImp.save(update);
		
	}

	public void delect(int id) {
		personImp.delect(id);
		
	}

	public List<Person> getAll() {	
		return personImp.getAll();
	}

}