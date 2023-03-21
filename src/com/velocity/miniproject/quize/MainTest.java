package com.velocity.miniproject.quize;

import java.util.Scanner;

import com.velocity.miniproject.quize.StudentLoginPage;
import com.velocity.miniproject.quize.StudentRegistrationPage;

public class MainTest {

	public static void main(String[] args) {
		{
			Scanner scanner=new Scanner(System.in);
			StudentRegistrationPage studentRegistrationPage=new StudentRegistrationPage();
			StudentLoginPage studentLoginPage=new StudentLoginPage();
		    System.out.println("Welcome to Quiz based application");
		    
		    System.out.println("Enter your choice>>");
		    System.out.println("1. Registration");
		    System.out.println("2. Login");
		    
		    int no=scanner.nextInt();
		    
		    if (no==1)
		    	{
		    		studentRegistrationPage.getStudentRegistration();
		    	}else if(no==2) {
		             studentLoginPage.getStudentLogin();
		             Questions.displayQuestions();
		             Result.getResult();     
		         
		             System.out.println("Thank you for Participating");
					 
		    	}else {
		                System.out.println("Invalid choice");
		              }
		    
			}

	}
}
