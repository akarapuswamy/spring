package controller;


import pojo.Student;
import service.StudentServiceDao;
import service.StudentServiceImp;

public class StudentController {
	
	private StudentServiceImp studnetserviceimp;
      
	public void setStudnetserviceimp(StudentServiceImp studnetserviceimp) {
		this.studnetserviceimp = studnetserviceimp;
	}

   public void save(Student student) {
	   System.out.println(" Student Controller...");
	   studnetserviceimp.save(student);
   }
	

}
 