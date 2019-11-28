package com.lti.methods.appuser;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Excel sheet1= new Excel();
	//not a good way
	//	System.out.println(	sheet1.sum(10, 20,6));
		
//		Excel sheet2= new Excel();
//		sheet2.sum(100, 200,8);

		
		
		
//		
//		int res=sheet1.sum(10, 20,6);
//		
//		System.out.println("add is:"+res);
		
		Scanner sc = new Scanner(System.in);
		
		Excel sheet1 = new Excel();
		
		int x,y,z;
	   System.out.println("Enter 3 nos");
	   x=sc.nextInt();
	   y=sc.nextInt();
	   z=sc.nextInt();
	   
	   int res= sheet1.sum(x,y,z);
	   
	   System.out.println("add "+res);
		
		
		
		
		
        
	}

}
