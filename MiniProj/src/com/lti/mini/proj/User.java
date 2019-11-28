package com.lti.mini.proj;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class User {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String csvfile="C:\\Users\\AW204_PC11\\Desktop\\miniproject\\complaints.csv";
		BufferedReader br = null;
				String line = "";
		String csvSplitBy = ",";
		int id = 1;
		String ans;
		do{
			
			switch(id){
			case 1:
			System.out.println("Enter ComplaintId");
			  id=sc.nextInt();
			  
			  
			break;
			
			
			case 2:
				System.out.println("Enter 2");
				break;
			
			default:
				//System.out.println("Wrong choice entered");
				
			}
			System.out.println("Do you want to continue yes/no");
		 ans = sc.next();
		
		}while (ans.equals("Yes") || ans.equals("y") || ans.equals("yes"));		
		{
		try{
			
			br= new BufferedReader(new FileReader(csvfile));
			while((line=br.readLine())!=null){
				String [] complaint=line.split(csvSplitBy);
				System.out.println("Complaint "+complaint[3] +"    "+complaint[13]);
				//if(complaint[13]==complaint[3]){
					
			
					
					//System.out.println(complaint[3]);
				}
				
			
			
			
		}catch(Exception e){
		System.out.println(e.getMessage());	
		
		}
		}
	}
		
	
}
	
	
		

	
















