package com.takeo.dao.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.takeo.configure.JdbcUtility;
import com.takeo.dao.StudentDAO;
import com.takeo.model.Student;
import com.takeo.query.QueryConstants;

public class StudentDAOImpl implements StudentDAO {
	
	Scanner sc = new Scanner(System.in);
	List<Student> addStudent = new ArrayList<Student>();
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	


	public String addStudent(Student sb) {
		// TODO Auto-generated method stub
	
	
		String msg = "";
	
		try {
			con = JdbcUtility.getConnection();
			
			ps = con.prepareStatement(QueryConstants.STUDENT_INSERT_QUERY);
			
			
			ps.setString(1, sb.getSname());
			
			ps.setString(2, sb.getSadd());
			
			int count = ps.executeUpdate();
			
			if(count!=0)
			 msg = "Student Information Added Successfully";
			else
			msg = "Student Information has not been Added! Try Again Later";
			
			
			 
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		finally
		{
			try {
				JdbcUtility.closeConnection(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		return msg ;
	}

	public List<Student> viewAllStudents() {
		
		// TODO Auto-generated method stub
		List<Student> addStudent = new ArrayList<Student>();
		
		try {
			
			con = JdbcUtility.getConnection();
			
			ps = con.prepareStatement(QueryConstants.STUDENT_DISPLAY_QUERY);
			 
			rs = ps.executeQuery();
			while(rs.next())
			{
				int sno = rs.getInt(1);
				 String sname = rs.getString(2);
				 String sadd = rs.getString(3);
				 Student student = new Student(sno,sname,sadd);
				 addStudent.add(student);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			try {
				JdbcUtility.closeConnection(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return addStudent;
	}

	public List<Student> viewStudent(int sno) {
		// TODO Auto-generated method stub
		List<Student>addStudent = new ArrayList<Student>();
		
	try {
		con = JdbcUtility.getConnection();
		
		ps = con.prepareStatement(QueryConstants.STUDENT_SELECT_QUERY);
		
		rs = ps.executeQuery();
		while(rs.next())
		{
			 sno = rs.getInt(1);
			 String sname = rs.getString(2);
			 String sadd = rs.getString(3);
			 Student student = new Student(sno,sname,sadd);
			 addStudent.add(student);
			 
			 
			
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		try {
			JdbcUtility.closeConnection(con, ps, rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		return addStudent;
	}

	public String updateStudent(int sno,String sadd) {
		// TODO Auto-generated method stub
		
		
		String msgs = "";
		
		
		try {
			
			con=JdbcUtility.getConnection();
			
			ps = con.prepareStatement(QueryConstants.STUDENT_UPDATE_QUERY);
			
		
			
			ps.setInt(2,sno);
			
			ps.setString(1,sadd);
			
			int count = ps.executeUpdate();
			if(count!=0)
				msgs = "Data is Updated Successfully";
			else
				msgs = "Data has not been Updated!";
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				JdbcUtility.closeConnection(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return msgs;
		
		
	}

	public String deleteStudent(int sno) {
		// TODO Auto-generated method stub
		
		
		String mgs = "";
		try {
			
			con=JdbcUtility.getConnection();
			
			ps=con.prepareStatement(QueryConstants.STUDENT_DELETE_QUERY);
			
			ps.setInt(1, sno);
			
			int count = ps.executeUpdate();
			if(count!=0)
				mgs = "Data is Deleted Successfully";
			else
				mgs = "Data has not been Deleted! Try Again Later!";
			
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				JdbcUtility.closeConnection(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	
	}


