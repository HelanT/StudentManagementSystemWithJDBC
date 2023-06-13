package com.takeo.model;

public class Student {
	
	private int sno;
	private String sname;
	private String sadd;
	public Student(int sno, String sname, String sadd) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
	}
	public Student(String sname, String sadd) {
		super();
		this.sname = sname;
		this.sadd = sadd;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public String setSadd() {
		return this.sadd = sadd;
	}
	public String setSadd(String msgs) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
