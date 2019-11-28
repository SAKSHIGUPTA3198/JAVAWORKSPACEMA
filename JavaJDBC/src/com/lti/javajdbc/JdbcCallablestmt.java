package com.lti.javajdbc;
import java.sql.*;

public class JdbcCallablestmt {
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";	// orcl or XE 
				Connection  conn=DriverManager.getConnection(url,"hr","hr");
			
			Statement stmt = null;
			 PreparedStatement pstmt=null;
			 if (conn != null) 
			 {
				    System.out.println("Connected");
			 }
			 try
			 {
				  CallableStatement cstmt1 = conn.prepareCall("{call getproductName(?,?)}");
				  cstmt1.setInt(1,102);
				  cstmt1.registerOutParameter(2,java.sql.Types.VARCHAR);
				cstmt1.executeUpdate();
				String userName= cstmt1.getString(2);
				System.out.println(userName);
			 }

			 catch(SQLException e)
			 {
				 System.out.println(e.getMessage());
			 }
			 finally
				{
					try
					{	
					conn.close();}
					catch(Exception e)
					{System.out.println(e);}
				}		
	}
	
}

