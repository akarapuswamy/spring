package Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import controller.StudentController;
import pojo.Student;

public class StudentClient {
	public static void main(String[] args) {
		Student s1= new Student(1, "swamy", "akarapu", "turkayamjal");
	ApplicationContext context = new ClassPathXmlApplicationContext("SpringG.xml");
	StudentController studentcontroller = (StudentController) context.getBean("controller");
    studentcontroller.save(s1);
  
	System.out.println(s1);
	}
}
