package com.lti.account.demo;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		int ch;
		Scanner sc = new Scanner(System.in);	
		
		
		System.out.println("enter the amount to  withdraw");
		double wAmt=sc.nextDouble();
		System.out.println("enter the amount to be deposited");
		double dAmt=sc.nextDouble();
		
		SavingAccount sa = new SavingAccount(10000,1000,wAmt,dAmt);
		sa.Withdraw();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
		sa.Deposit();
		
	
//		System.out.println("Enter your choice : 1.withdraw 2.deposit ");
//		ch = sc.nextInt();
//		
//		switch(ch)	
//		{
//		case 1 :
//			System.out.println("Enter the amount ");
//	int	amount = sc.nextInt();
//			cust.withdraw(amount);	
//		          break;
//		case 2 :
//			System.out.println("Enter the amount ");
//			amount = sc.nextInt();cust.deposit(amount);
//		         break;
//		}
		
		
		//a.minBal=minBal;		
	}

}
