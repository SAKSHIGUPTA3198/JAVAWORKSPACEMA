package com.lti.oops.user;

import java.util.Scanner;

public class UserEmpApp {
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
	
		
		
		Product p1 =  new Product(101,"Jay",5000.00f);
		System.out.println(p1);
		
		
		p1.giveIncr(50);
		
		Product p2 =  new Product(102,"AJay",9000.00f);
		p2.giveIncr(100);
		System.out.println(p2);
		
		System.out.println("Enter product quantity");
		int quantity=sc.nextInt();
		
		
		p1.CalBill(quantity);
		p2.CalBill(quantity);
		
		
		
		
	}

}
