package com.takeo.query;

public interface QueryConstants {
	
	public String STUDENT_INSERT_QUERY = "insert into student(sname,sadd)values (?,?)";
	
	public String STUDENT_DISPLAY_QUERY ="select * from student";
	
	public String STUDENT_SELECT_QUERY = "select * from student";
	
	public String STUDENT_UPDATE_QUERY = "update student set sadd = ? where sno=?";
	
	public String STUDENT_DELETE_QUERY = "delete from student where sno=?";
	
	
	

}
