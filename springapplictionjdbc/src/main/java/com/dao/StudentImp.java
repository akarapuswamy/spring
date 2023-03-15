package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

import com.Queries.StudentQueries;
import com.pojo.Student;

public class StudentImp implements StudentDao {
	
	public BasicDataSource bas;
	
	
	
	public void setBas(BasicDataSource bas) {
		this.bas = bas;
	}

	public void save(Student stu) {
		//System.out.println("StudentImp save Imp");
		Connection con = null;
		PreparedStatement ps = null;
		
	  try 
	  {
		con=bas.getConnection();
		ps=con.prepareStatement(StudentQueries.INSERT_QUERY);
		ps.setInt(1, Student.getId());
		ps.setString(2, Student.getName());
		ps.setString(3, Student.getEmail());
		ps.setString(4, Student.getAddress());
		
		ps.executeUpdate();
		System.out.println("inside Succesfully");
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		
			try {
				if (ps != null) {
					ps.close();
					con.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

	public void update(Student update) {
		Connection con= null;
		PreparedStatement ps= null;
		
		try {
			con=bas.getConnection();
			ps=con.prepareStatement(StudentQueries.UPDATE);
			ps.setString(1, update.getName());
			ps.setString(2, update.getEmail());
			ps.setString(3, update.getAddress());
			ps.setInt(4, update.getId());
			
			int i = ps.executeUpdate();
			System.out.println(i+"student update");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void delect(Integer id) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con=bas.getConnection();
	//		ps=con.prepareStatement(S)
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public List<Student> Find_all(Student findall) {
		
		return null;
	}

	
}
