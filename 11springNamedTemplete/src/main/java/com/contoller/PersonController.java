package com.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pojo.Person;
import com.service.PersonServiceImp;
@Controller
public class PersonController {
	@Autowired
	private PersonServiceImp PersonservicImp;
	
	public  void insert(Person person) {
		 PersonservicImp.save(person);	
	}

}
