package pojo;

public class Student {
	private int id;
	private String StudentName;
	private String LastName;
	private String Address;
	
	public Student() {
		super();
	}

	public Student(int id, String studentName, String lastName, String address) {
		this.id = id;
		StudentName = studentName;
		LastName = lastName;
		Address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", StudentName=" + StudentName + ", LastName=" + LastName + ", Address=" + Address
				+ "]";
	}
}
