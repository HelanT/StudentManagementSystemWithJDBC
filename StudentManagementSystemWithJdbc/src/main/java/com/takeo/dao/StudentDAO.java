package com.takeo.dao;

import java.util.List;

import com.takeo.model.Student;

public interface StudentDAO {
	
	public String addStudent(Student sb);
	
	public List<Student> viewAllStudents();
	
	public List<Student> viewStudent(int sno);
	
	public String  updateStudent(int sno,String sadd);
	
	public String deleteStudent(int sno);
	
	

}
