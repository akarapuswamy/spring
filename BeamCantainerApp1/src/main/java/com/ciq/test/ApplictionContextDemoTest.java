package com.ciq.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.pojo.Person;

public class ApplictionContextDemoTest {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("abstractApplicontext.xml");
		Person p1 =context.getBean("person",Person.class);
		p1.setPersonId(1);
		p1.setPersonName("swamy");
		p1.setPeronLastname("akarapu");
		System.out.println(p1);
		context.registerShutdownHook();
	}

}
