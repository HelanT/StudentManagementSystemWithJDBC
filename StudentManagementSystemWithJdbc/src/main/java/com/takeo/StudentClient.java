package com.takeo;

import java.util.Scanner;

import com.takeo.dao.impl.StudentDAOImpl;
import com.takeo.details.StudentDetails;
import com.takeo.model.Student;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		StudentDAOImpl daoImpl = new StudentDAOImpl();
		
		while(true)
		{
			System.out.println("=============================");
			System.out.println("         1)Student       	");
			System.out.println("         2)Exit              ");
			System.out.println("==============================");
			
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
			   StudentDetails details = new StudentDetails();
			   details.StudentMenuDetails();
			   break;
			   
			case 2:
				System.out.println("Thanks for using our App");
				System.exit(0);
				break;
				
				default:
					System.out.println("Choose 1 to 2 between");
					
			    
			 
			}
			
		}
	}

}
