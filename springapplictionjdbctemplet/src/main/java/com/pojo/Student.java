package com.pojo;

public class Student {
	static int id;
	static String Studentname;
	static String Email;
	static String address;
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, String email, String address) {
		super();
		this.id = id;
		this.Studentname = name;
		Email = email;
		this.address = address;
	}
	public static int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getName() {
		return Studentname;
	}
	public void setName(String name) {
		this.Studentname = name;
	}
	public static String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public static String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + Studentname + ", Email=" + Email + ", address=" + address + "]";
	}


	


}
