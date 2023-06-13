package com.takeo.details;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.takeo.StudentClient;
import com.takeo.dao.impl.StudentDAOImpl;
import com.takeo.model.Student;

public class StudentDetails {
	
  
	public static void StudentMenuDetails()
	
	{
		Scanner sc = new Scanner(System.in);
		StudentDAOImpl daoImpl = new StudentDAOImpl();
		List<Student> addStudents = new ArrayList<Student>();
		
		while(true)
		{
			System.out.println("============================");
			System.out.println("         1)AddStudents       ");
			System.out.println("         2)ViewAllStudents    ");
			System.out.println("         3)ViewStudent        ");
			System.out.println("         4)UpdateStudent      ");
			System.out.println("         5)DeleteStudent      ");
			System.out.println("         6)Back               ");
			System.out.println("===============================");
			
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Student Number:");
				int sno = sc.nextInt();
				System.out.println("Enter Student Name:	");
				String sname = sc.next();
				System.out.println("Enter Student Address:");
				String sadd = sc.next();
				
			    Student stu = new Student(sno,sname,sadd);
			    addStudents.add(stu);
			    String msg = daoImpl.addStudent(stu);
			    if(msg!=null)
			    	System.out.println(msg);
			    else
			    	System.out.println(msg);
			    break;
				
			case 2:
				List<Student> viewAllStudents = daoImpl.viewAllStudents();
				for(Student se: viewAllStudents)
				{
					System.out.println(se.getSno()+"\t"+se.getSname()+"\t"+se.getSadd());
				}
				break;
				
			case 3:
				System.out.println("Enter Student Number:");
				int so = sc.nextInt();
				List<Student> viewStudents = daoImpl.viewStudent( so);
			    for(Student s : viewStudents)
			    {
			    	if(s.getSno()== so)
			    	{
			    		System.out.println(s.getSno()+"\t"+s.getSname()+"\t"+s.getSadd());
			    	}
			    	else
			    		System.out.println("Given Number doesn't Exist!");
			    }
			    break;
			    
			case 4:
				System.out.println("Enter Student Number:" );
				int sn = sc.nextInt();
				System.out.println("Enter New Student Address:");
				String adrs = sc.next();
				String msgs = daoImpl.updateStudent(sn, adrs);
				if(msgs!=null)
					System.out.println(msgs);
				else
					System.out.println(msgs);
				break;
				
			case 5:
				System.out.println("Enter Student Number:");
				int snu = sc.nextInt();
				String mgs = daoImpl.deleteStudent(snu);
				if(mgs!=null)
				       System.out.println(mgs);
				else
					System.out.println(mgs);
				break;
					
					
					
			case 6:
				StudentClient.main(null);
				break;
				
				default:
					System.out.println("Choose 1 to 6 between");
					
		
				
			}
}
}
}