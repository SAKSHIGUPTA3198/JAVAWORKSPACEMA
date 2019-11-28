package com.lti.javajdbc;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
	import java.sql.Statement;

	public class Jdbc2getRecords 
	
	{
		public static void main(String[] args)throws SQLException, ClassNotFoundException {
			
		String url = "jdbc:oracle:thin:scott@//localhost:1521/XE";
		 
		 Connection  conn=DriverManager.getConnection(url,"hr","hr");
		 
		 if (conn != null) 
		 {
			    System.out.println("Connected");
		 }
		 try
		 {
		 Statement stmt = conn.createStatement();
		 
		 int i = stmt.executeUpdate("Insert into Products values(568,'printer',5700)");
		 System.out.println(i+"record inserted");
		 
		
		}catch (SQLException e)
		{ System.out.println(e.getMessage());
	}
    finally
    { 
    	conn.close();
    }
		}
	}




