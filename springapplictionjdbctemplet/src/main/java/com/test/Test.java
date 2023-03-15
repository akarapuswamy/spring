package com.test;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Student;

public class Test {
	public static void main(String[] args) {
		Student s1= new Student(4,"eafffs","vaeeeemshgmail.com","mchirrrrrala");
	//	Student s2= new Student(2,"pradeep","pradeep@gmail.com","ramagundham");
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
	//	  StudentImp imp = (StudentImp) ac.getBean("dao");
		
	//	  imp.save(s1);
		//  imp.update(s1);
		  
		  
		  
	}

}
