package dao;

import pojo.Student;

public class StudentImp implements StudentDao {

	public void save(Student student) {
		System.out.println("Student dao impl"+student);
		
	}

}
