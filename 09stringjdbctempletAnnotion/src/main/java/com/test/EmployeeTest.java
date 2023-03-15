package com.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.EmployeeController;
import com.dao.EmployeeDao;
import com.pojo.Employee;

public class EmployeeTest {
	
public static void main(String[] args) {
	ArrayList<Employee> emp = new ArrayList<Employee>();
	emp.add(new Employee(1, "adg", 320000.00, "Tuttt"));
	emp.add(new Employee(2, "reee", 340000.00, "Tuuyy"));
	emp.add(new Employee(3, "adg", 3760000.00, "Tuoijj"));
	emp.add(new Employee(4, "adg", 3789000.00, "Tuyyy"));
	
 
	ApplicationContext ac = new ClassPathXmlApplicationContext("annotion.xml");
	EmployeeController contoller = (EmployeeController) ac.getBean("abc");
	
	ArrayList<Employee> AllEmps=contoller.getall();
		
	for (Employee employee : AllEmps) {
		contoller.getall();
		System.out.println(employee);
	}
	
  }
}