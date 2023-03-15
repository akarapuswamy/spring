package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.contoller.PersonController;
import com.pojo.Person;

public class ClientPerson {
	public static void main(String[] args) {
		Person p1 = new Person(1, "shiva", "turka");
		ApplicationContext con = new  ClassPathXmlApplicationContext("spring.xml");
		PersonController personcontroler=  con.getBean(PersonController.class);
		personcontroler.insert(p1);
	}
}