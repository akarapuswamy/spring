package com.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeImp;
public class ClientEmployee {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeImp emp = (EmployeeImp) ap.getBean("dao");
		emp.SelectEmployee(4);
	}
}