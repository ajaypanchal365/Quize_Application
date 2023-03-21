package com.velocity.miniproject.quize;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.velocity.miniproject.quize.CommonConnection;

public class StudentLoginPage implements StudentLogin {
	@Override
	public void getStudentLogin() {
	
		try {
			Connection con = CommonConnection.getConnection();
		    PreparedStatement ps=con.prepareStatement("select UserName from student where UserName=? and Password=?");
			 
			 for(int i=1;i<=10;i++)
			 {
				 Scanner scanner = new Scanner(System.in);
			     System.out.println("Enter your User Name>>");
			     String username=scanner.nextLine();
			 
			     System.out.println("Enter your Password>>");
			     String password=scanner.nextLine();
			     ps.setString(1, username);
			     ps.setString(2, password);
			     ResultSet rs=ps.executeQuery();
			     //String username1= rs.getString(UserName);
			     //String password1=rs.getString(Password);
			   	 
			    
			     boolean checkuser = false;
			     if (rs.next())
			     {
			    	 checkuser= true;
			       	 System.out.println("Login Succesfully...");
			         System.out.println(" ");
			         System.out.println("Answer the Below Questions ");
			       	 break;
			     }
			     else 
			     {
			    	 System.out.println("Invalid UserName Or Password, Please Try Again");
			     }
			     
			     }
		}
			 catch (SQLException e) {
			e.printStackTrace();
		}
	 
	}
}

