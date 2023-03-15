package com.ac.dao;

import org.springframework.stereotype.Component;

import com.ac.entity.Student;

@Component
public class DaoImpl implements Dao {

	@Override
	public void std(Student s) {

		System.out.println("DAo.......!");
	}

}
