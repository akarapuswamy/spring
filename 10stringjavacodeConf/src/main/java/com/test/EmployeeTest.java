package com.test;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.ConfigEmp;
import com.dao.EmployeeDao;
import com.dao.EmployeeImp;
import com.pojo.Employee;

public class EmployeeTest {
	
public static void main(String[] args) {
	Employee e1 = new Employee(7,"Jithu Anna",1088000.00,"KOYADA");
	ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigEmp.class);
	EmployeeImp imp = (EmployeeImp) ac.getBean("dao");
	imp.save(e1);
  }
}