package com.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.dao.EmployeeImp;

@Configurable
@ComponentScan(basePackages ="com.*" )

public class ConfigEmp {
	@Bean
	public EmployeeImp empl() {
		return new EmployeeImp();
		
	}
	
}
