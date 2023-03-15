package client;

import org.springframework.beans.propertyeditors.ClassArrayEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo1.Employee;
import pojo1.GreetingMsg;

public class Client1 {
	public static void main(String[] args) {
		ApplicationContext conxt = new ClassPathXmlApplicationContext("spring.xml");
	//	GreetingMsg greeting=(GreetingMsg) conxt.getBean("massage");
		Employee e1=(Employee) conxt.getBean("employee");
		System.out.println(e1);
		e1.getId();
		e1.getName();
		e1.getAddress();
		e1.getSalary();

}

}
