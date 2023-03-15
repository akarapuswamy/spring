package com.ciq.util;
import java.beans.PropertyVetoException;
import javax.swing.Spring;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.PoolableConnection;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.zaxxer.hikari.HikariDataSource;

public class Connection {
	private static String url ="\"jdbc:mysql://localhost:3306/spring_databaseproties";
	private static String drive="com.mysql.cj.jdbc.Driver";
	private static String user = "root";
	private static String pwd = "swamy";
	
	public static void main(String[] args) throws PropertyVetoException {
		
		BasicDataSource basic = new BasicDataSource();
		basic.setUrl(url);
		basic.setDriverClassName(drive);
		basic.setUsername(user);
		basic.setPassword(pwd);
		System.out.println(basic);
		
	  ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setDriverClass(drive);
	    cpds.setJdbcUrl(url);
	    cpds.setUser(user);
		cpds.setPassword(pwd);
		System.out.println(cpds);	
		
		HikariDataSource hakari= new HikariDataSource();
		hakari.setDriverClassName(drive);
		hakari.setJdbcUrl(url);
		hakari.setUsername(user);
		hakari.setPassword(pwd);
		System.out.println(hakari.getConnectionInitSql());
		
	}
}