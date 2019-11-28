package com.lti.shopping.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lti.shopping.entity.Product;


public class ClientApp {
	
public static void main(String[] args) {
		
		//IProduct service = new ImplProduct();
		
		Scanner sc = new Scanner(System.in);
		String ans;
		int no;
		do {
			System.out.println("***** DMART Products Services ****");
			System.out.println("1.Add product ");
			System.out.println("2.Display all product ");
			System.out.println("Pls enter your choice: ");
			no = sc.nextInt();

			switch (no)
			{
			
			case 1: 
				System.out.println("inside switch case 1");
					
				//  List<Product> prdList = new ArrayList<>();
					//System.out.println("enter the details of product");
					//Product p1= new Product(sc.nextInt(),sc.next(),sc.nextDouble());
						//	prdList=service.addProduct(p1);
					//System.out.println(prdList);
					break;
					//Product p= new Product(101,"Mobile",50000);
					//service.addProduct(p);
					
					//List<Product> prdList = new ArrayList<>();
					//prdList = service.addProduct(p);
					 
			
			case 2: System.out.println("inside switch case 2");
					break;
			default:System.out.println("Enter proper choice");
					break;
			}
			System.out.println("Do you want to continue yes/no");
			ans = sc.next();
		} while (ans.equals("Yes") || ans.equals("y") || ans.equals("yes"));
	}

}



