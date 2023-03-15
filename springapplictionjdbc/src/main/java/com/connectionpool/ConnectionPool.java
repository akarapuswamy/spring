package com.connectionpool;

import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnectionPool {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("Spring.xml");
		BasicDataSource basic = (BasicDataSource) con.getBean("swa");
		try {
			System.out.println(basic.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
