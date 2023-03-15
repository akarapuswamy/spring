package com.ac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ac.entity.Student;
import com.ac.service.ServiceImpl;
@Component
public class Controll {
	
	@Autowired
	private ServiceImpl s;
	public void cont(Student std) {
		System.out.println("Controller....!");
		s.jio(std);
	}

}
