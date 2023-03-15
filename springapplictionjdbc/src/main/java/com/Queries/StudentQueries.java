package com.Queries;

public interface StudentQueries {
	String INSERT_QUERY = "INSERT INTO Student VALUES(?,?,?,?)";
	String UPDATE = "UPDATE Student SET StudentNAME=?,ADDRESS=?,EMAIL=? WHERE ID=?";
	String SelectAll = "SELECT * FROM Student";
}
