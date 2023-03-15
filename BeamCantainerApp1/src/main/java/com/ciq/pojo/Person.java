package com.ciq.pojo;

public class Person {
	private int PersonId;
	private String PersonName;
	private String PeronLastname;
	
	
	public Person() {
		super();
	}


	public Person(int personId, String personName, String peronLastname) {
		super();
		PersonId = personId;
		PersonName = personName;
		PeronLastname = peronLastname;
	}


	public int getPersonId() {
		return PersonId;
	}


	public void setPersonId(int personId) {
		PersonId = personId;
	}


	public String getPersonName() {
		return PersonName;
	}


	public void setPersonName(String personName) {
		PersonName = personName;
	}


	public String getPeronLastname() {
		return PeronLastname;
	}


	public void setPeronLastname(String peronLastname) {
		PeronLastname = peronLastname;
	}


	@Override
	public String toString() {
		return "Person [PersonId=" + PersonId + ", PersonName=" + PersonName + ", PeronLastname=" + PeronLastname + "]";
	}
	
	public void hai() {
		System.out.println("haiii.....");
	}
	
	public void bye() {
		System.out.println("bye........");
	}

}
