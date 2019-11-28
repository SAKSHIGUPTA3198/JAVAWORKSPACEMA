package com.lti.shop.user;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import com.lti.shop.dao.IDaoProduct;
import com.lti.shop.dao.ImplDaoProduct;
import com.lti.shop.entity.Product;

public class UserApp {
public static void main(String[] args) {
		
		IDaoProduct service = new ImplDaoProduct();
		List<Product> prdList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String ans;    
		int no;
		 
		do {
			System.out.println("***** DMART Products Services ****");
			System.out.println("1.Add product ");
			System.out.println("2.Display all product ");
			System.out.println("3.search your product");
			System.out.println("Pls enter your choice: ");
			no = sc.nextInt();

			switch (no)
			{
			case 1: 
					System.out.println("enter the details of product");
					Product p1= new Product(sc.nextInt(),sc.next(),sc.nextDouble());
					service.addProducts(p1);
					break;	
			case 2:
				prdList=service.getAllProducts();
			System.out.println(prdList);
					break;
			case 3: System.out.println(" enter product id");
			      int id=sc.nextInt();
				Product p=service.showProduct(id);
				System.out.println(p);
				break;
			default:System.out.println("Enter proper choice");
					break;
			}
			System.out.println("Do you want to continue yes/no");
			ans = sc.next();
		} while (ans.equals("Yes") || ans.equals("y") || ans.equals("yes"));
	}

	}


