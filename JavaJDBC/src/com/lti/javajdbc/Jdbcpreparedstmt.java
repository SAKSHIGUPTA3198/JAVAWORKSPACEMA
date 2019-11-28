package com.lti.javajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbcpreparedstmt {
	
	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		
		String url = "jdbc:oracle:thin:scott@//localhost:1521/XE";
		 
		 Connection  conn=DriverManager.getConnection(url,"hr","hr");
		 PreparedStatement pstmt = null;
		 if (conn != null) 
		 {
			    System.out.println("Connected");
		 }
		 try
		 {
		Scanner sc = new Scanner(System.in);
		 pstmt= conn.prepareStatement("Insert into products values(?,?,?)");
		int pid = sc.nextInt();
		String pname = sc.next();
		double pcost = sc.nextDouble();
		pstmt .setInt(1, pid);
		pstmt.setString(2,pname);
		pstmt.setDouble(3,pcost);
		//pstmt.setString(2,"charger");
		//pstmt.setDouble(3,1000);
		int i =pstmt.executeUpdate();
		 System.out.println(i+"record inserted");
		 Statement stmt = conn.createStatement();
		 ResultSet rs = stmt.executeQuery("Select * from Products order by prdId");
		 
		 System.out.println("\t " +  pid +" "  + pname  +"\t"  + pcost  +"\n");
		 
		 
		
		}catch (SQLException e)
		{ System.out.println(e.getMessage());
	}
    finally
    { 
    	conn.close();
    }                                                    
		}
	}



