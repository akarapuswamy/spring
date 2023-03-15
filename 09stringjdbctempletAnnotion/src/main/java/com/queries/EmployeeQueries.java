package com.queries;

public interface EmployeeQueries {
	String  SElECTALL = "SELECT * FROM EMPOLYEE";
	String DELETE_BY_ID = "DELETE FROM EMPOLYEE WHERE ID=?";
	String INSERT_QUERY = "INSERT INTO EMPOLYEE VALUES(?,?,?,?)";
	String UPDATE = "UPDATE EMPOLYEE SET NAME=?,SALARY=?,EMAIL=? WHERE ID=?";
	String getall="SELECT * FROM EMPOLYEE";
	
	

}
