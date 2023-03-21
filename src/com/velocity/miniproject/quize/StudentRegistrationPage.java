package com.velocity.miniproject.quize;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import com.velocity.miniproject.quize.CommonConnection;

public class StudentRegistrationPage implements StudentRegistration {
	Scanner scanner = new Scanner(System.in);
	@Override
	public void getStudentRegistration() 
	{	
		try {
			Connection con=CommonConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into student(FirstName,LastName,UserName,Password,City,MobileNumber,MailId)Values(?,?,?,?,?,?,?)");
		      for(int i=1;i<=1;i++)
		    {
		      
		      System.out.println("Enter your firstname>>");
              String firstName=scanner.nextLine();
           
              System.out.println("Enter your lastname>>");
              String lastName=scanner.nextLine();
           
              System.out.println("Enter your user name>>");
              String userName=scanner.nextLine();
           
              System.out.println("Enter your password>>");
              String password=scanner.nextLine();
           
              System.out.println("Enter your city>>");
              String city=scanner.nextLine();
           
              System.out.println("Enter your mobile number>>");
              String mobileno=scanner.nextLine();
           
              System.out.println("Enter your mail id>>");
              String mailid=scanner.nextLine();
              
               ps.setString(1, firstName);
		         ps.setString(2, lastName);
		         ps.setString(3, userName);
		         ps.setString(4, password);
		         ps.setString(5, city);
		         ps.setString(6,mobileno);
		         ps.setString(7, mailid);
		
		         ps.execute();
		      }  
		      System.out.println("Registration Successfully..");
	    
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}