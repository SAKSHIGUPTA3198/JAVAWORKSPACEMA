package com.lti.ebill.demo;

import java.util.Scanner;

public class Ebill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc = new Scanner(System.in);
		boolean Yes,No;
		System.out.println("ELECTRICITY BILL APPLICATION");
		System.out.println(" enter meterno.");
		int meterno=sc.nextInt();
		System.out.println(" enter previous meter reading");
		int prevmr=sc.nextInt();
		System.out.println(" enter current meter reading");
		int currmr=sc.nextInt();
		double bill;
		
	do{
			System.out.println("WELCOME");
			
			if(bill==Yes){
		if(currmr < 50)
		{
			bill = (currmr-prevmr)*2;
				
			}
		else
		
		if(currmr > 50 ){
			
			bill = (currmr-prevmr)*3.5;
		
		}
		}
		System.out.println("Your bill is "+currmr);	
		while(bill ==Yes){
			System.out.println("Do you want to continue  ");	
		
		
		
		}
		
		
	}
	
	}	
		
			
			
		

