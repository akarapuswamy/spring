package com.ac.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ac.controller.Controll;
import com.ac.entity.Student;

public class Test {
	private static Logger log=LoggerFactory.getLogger(Test.class);
	public static void main(String[] args) {
		Student s = new Student(90, "swamy");
		log.info("before context......!{}");
		ApplicationContext aac=new ClassPathXmlApplicationContext("AutoScan.xml");
		Controll con = (Controll) aac.getBean("controll");
		con.cont(s);
		log.info("After Context.........!{}");
	}
}