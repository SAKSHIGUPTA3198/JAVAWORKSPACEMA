package com.lti.shop.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.lti.shop.entity.Product;
public class ImplDaoProduct implements IDaoProduct {
	
	List<Product> myList = new ArrayList<>();
	public void addProducts(Product p){
		System.out.println(" calling addProduct()..........inside dao");
		System.out.println(p);
		try
		{
			String url = "jdbc:oracle:thin:scott@//localhost:1521/XE";
			Connection  conn=DriverManager.getConnection(url,"hr","hr");
			
			  PreparedStatement pstmt= conn.prepareStatement("Insert into Products(prdid,ProductName,prdCost)values(?,?,?)");
							pstmt.setInt(1,p.getPrdId());
				pstmt.setString(2, p.getProductName());
				pstmt.setDouble(3, p.getPrdCost());
				
				int i= pstmt.executeUpdate();
				System.out.println(i+"record added");
		}
				catch (Exception e) {
					System.out.println(e.getMessage());
					//throw new CustomExp("some error at db layer", e);
				}
				
	}
@Override
	public List<Product> getAllProducts()  {
		
		try 
		{
			String url = "jdbc:oracle:thin:scott@//localhost:1521/XE";
			Connection  conn=DriverManager.getConnection(url,"hr","hr");
			
			
			Statement stmt = conn.createStatement();			
			ResultSet rs = stmt.executeQuery("Select * from Products");
			
			while (rs.next()) 
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				Double cost = rs.getDouble(3);
			Product	 p = new Product(id, name, cost);
				myList.add(p);
			}
}
			catch (Exception e) {
				System.out.println(e.getMessage());
				//throw new CustomExp("some error at db layer", e);
			}
			return myList;
			}	


@Override
public Product showProduct(int prdNo) {
	Product p = null;
	try 
	//(Connection conn = DbUtil.getConnection())
	{String url = "jdbc:oracle:thin:scott@//localhost:1521/XE";
	Connection  conn=DriverManager.getConnection(url,"hr","hr");
		//System.out.println("connected");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Products where Prdid=" + prdNo);

		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			Double cost = rs.getDouble(3);
			p = new Product(id, name, cost);
		}
		return p;
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return p;

}
}


/*package com.lti.shop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.lti.shop.entity.Product;
public class ImplDaoProduct implements IDaoProduct {
	
	public void addProducts(Product p){
		System.out.println(" calling addProduct()..........inside dao");
		System.out.println(p);
		
		
		try
		{String url = "jdbc:oracle:thin:scott@//localhost:1521/XE";
		 
		 Connection  conn=DriverManager.getConnection(url,"hr","hr");
		  PreparedStatement pstmt= conn.prepareStatement("Insert into Products(prdid,ProductName,prdCost)values(?,?,?)");
			pstmt.setInt(1,p.getPrdId());
			pstmt.setString(2, p.getProductName());
			pstmt.setDouble(3, p.getPrdCost());
			
			int i= pstmt.executeUpdate();
			System.out.println(i+"record added");
		}catch(SQLException e)
		{
		System.out.println(e.getMessage());
		
		}
	}
}
*/	
  

	