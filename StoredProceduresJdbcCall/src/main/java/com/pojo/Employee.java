package com.pojo;

public class Employee {
	
	private int id;
	private String EmpName;
	private double salary;
	private String Address;
	
	public Employee() {
		super();
	}

	public Employee(int id, String empName, double salary, String address) {
		super();
		this.id = id;
		EmpName = empName;
		this.salary = salary;
		Address = address;
	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", EmpName=" + EmpName + ", salary=" + salary + ", Address=" + Address + "]";
	}
}
