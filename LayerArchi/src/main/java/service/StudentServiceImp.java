package service;

import dao.StudentDao;
import dao.StudentImp;
import pojo.Student;

public class StudentServiceImp implements StudentServiceDao {
	
	private StudentImp studentimp;
	
	public void save(Student student) {
		System.out.println("Student service imp");
		studentimp.save(student);
	}

	public void setStudentimp(StudentImp studentimp) {
		this.studentimp = studentimp;
	}


	
	
}
