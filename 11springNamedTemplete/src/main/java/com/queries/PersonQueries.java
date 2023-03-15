package com.queries;

public interface PersonQueries {
	String Insert="INSERT INTO PERSON VALUES(:id,:name,:address)";
	String update="UPDATE PERSON SET NAME=?,ADDRESS=? WHERE ID=?";
	String delect ="DELETE FROM PERSON WHERE ID=?";
	String getall="SELECT * FROM PERSON";

}
