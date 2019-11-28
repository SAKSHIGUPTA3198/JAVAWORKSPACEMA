package com.lti.basics.demos;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  no;
		int sum=0;
		Scanner sc= new Scanner (System.in);
		System.out.println("enter no. of students");
		no=sc.nextInt();
		int marks[]= new int[no];
		
	//int	marks[]={10,20,30,40,50};
	for(int i=0;i<no;i++){
		System.out.println("enter marks "+(i+1)+":");
		marks[i]=sc.nextInt();
		
	}
	for( int i=0;i<no;i++)
	{
		System.out.print(marks[i]+" ");
	}
	
	
	for( int i=0;i<no;i++)
	{
		
		 sum=sum+marks[i];
		 System.out.print(marks[i]+" ");	
	}
	
	
	System.out.println(sum);
	
	}

}
