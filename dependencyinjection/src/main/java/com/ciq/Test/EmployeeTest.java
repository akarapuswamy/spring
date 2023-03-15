package com.ciq.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.pojo.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
	//	Employee e1 = new Employee(1, "swamy", "turkayamjal", 32000.00);
		ApplicationContext con = new ClassPathXmlApplicationContext("Spring.xml");
	   Employee e1 = (Employee) con.getBean("swa");
	    System.out.println(e1);
	     
	}

}
