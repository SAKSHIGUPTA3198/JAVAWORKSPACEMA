
package com.lti.oops.user;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter barcode for p2");
		int id =sc.nextInt();
		
		// TODO Auto-generated method stub
		//getter/setter
		Product p1= new Product();
		
		p1.setBarcode(111);
		p1.setPname("pen");
		p1.setCost(50.00f);
	
		
		System.out.println(p1);
		//constructor
		
	
		Product p2= new Product(id,"pencil",5.20f);
		
		System.out.println(p2);

	}

}
