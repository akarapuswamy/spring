package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDao;
import com.dao.EmployeeImpTemplete;
import com.pojo.Employee;

public class EmployeeTest {
	
public static void main(String[] args) {
	Employee e1 = new Employee(1, "swamy", 3200.00, "turkayamjal");
	ApplicationContext ac = new ClassPathXmlApplicationContext("Templete.xml");
       EmployeeDao dao = (EmployeeImpTemplete) ac.getBean("dao");
       dao.save(e1);
}
}