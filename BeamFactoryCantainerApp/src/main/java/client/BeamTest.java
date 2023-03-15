package client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import pojo.Msg;

public class BeamTest {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Sp.xml");
		BeanFactory beanfactory = new XmlBeanFactory(resource);
		Object obj = beanfactory.getBean("msg");
		Msg msg = (Msg) obj;
		System.out.println(msg);
		
		Msg msg2 = beanfactory.getBean(Msg.class);
		System.out.println(msg2);
		System.out.println("Second Way Create");
		
		//aliasNames 
		String[] aliasname = beanfactory.getAliases("mmm");
		for (String string : aliasname) {
			System.out.println(string);
		}	
	}
}
