package com.ac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ac.dao.DaoImpl;
import com.ac.entity.Student;
@Component
public class ServiceImpl implements Service {

	@Autowired
	private DaoImpl d;
	@Override
	public void jio(Student std) {

		System.out.println("Service.......!"+std.getId()+" "+std.getName());
		
		d.std(std);
	}

	
}
