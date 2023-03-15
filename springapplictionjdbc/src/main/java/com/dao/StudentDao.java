package com.dao;

import java.util.List;

import com.pojo.Student;

public interface StudentDao {
   
	void save(Student stu);
	void update(Student update);
	void delect(Integer id);
	List<Student>Find_all(Student findall);
	
}
