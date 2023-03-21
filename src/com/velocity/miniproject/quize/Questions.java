package com.velocity.miniproject.quize;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Questions {
	
		public static void displayQuestions() {
			
		try {
			Connection con=CommonConnection.getConnection();
			
			String query1="select * from question";
			
			PreparedStatement ps=con.prepareStatement(query1);
			ResultSet rs=ps.executeQuery();               
			int mark=0;
			while(rs.next())
			{
				int questionid=rs.getInt("sr_no");
				String Question=rs.getString("Question");
				String a=rs.getString("Option_1");
				String b=rs.getString("Option_2");
				String c=rs.getString("Option_3");
			    String d=rs.getString("Option_4");
			    String correct_answer=rs.getString("correct_answer");
			  
			    System.out.println("  ");
			    
			    System.out.println(questionid +"."+Question);
			    
			    System.out.println("    ");
			    System.out.println(a);
			    System.out.println(b);
			    System.out.println(c);
			    System.out.println(d);
			    System.out.println("Enter your answer>>");
			    Scanner scanner= new Scanner(System.in);
			    String answer=scanner.nextLine();
			    
			    if(answer.equals(correct_answer))
			    {
			    	System.out.println("Answer is correct..");
			    	mark++;
			    }
			    else if(answer.equals(correct_answer))
			    {
		            System.out.println("Answer is correct");
                    mark++;                
			    }
			    else if(answer.equals(correct_answer))
			    {
			    	System.out.println("Answer is correct");
                    mark++;                 
			    }
			    else if(answer.equals(correct_answer))
			    {
			    	System.out.println("Answer is correct");
                    mark++;              
			    }
			    else
			    {
			    	System.out.println("Answer is incorrect");
			    }
			    
			    System.out.println("your Mark is:" +mark);
			 	    			    	
			    }
			}
			 catch (SQLException e) {
			e.printStackTrace();
		}
		 
	}
	}



