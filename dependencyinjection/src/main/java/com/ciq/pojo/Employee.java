package com.ciq.pojo;

public class Employee {
	private int id;
	private String EmpName;
	private String Address;
	private double salary;
	
	
//	
//	public Employee() {
//		super();
//	}



//	public Employee(int id, String empName, String address, double salary) {
//		super();
//		this.id = id;
//		EmpName = empName;
//		Address = address;
//		this.salary = salary;
//	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getEmpName() {
		return EmpName;
	}



	public void setEmpName(String empName) {
		EmpName = empName;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", EmpName=" + EmpName + ", Address=" + Address + ", salary=" + salary + "]";
	}
	
	

}
