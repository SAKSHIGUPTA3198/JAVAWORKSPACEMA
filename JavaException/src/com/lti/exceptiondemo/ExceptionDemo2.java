package com.lti.exceptiondemo;

public class ExceptionDemo2 {
	public static void main(String args[]){
		

int x=15,y=5,a=5,z;
				int arr[] = {10,5};
		try
		{   
			int b = arr[4]/a;		
			z = 500/10;  //error 			
			System.out.println("z:" + z);
		    //System.out.println(" This will not be Executed if error occurs");
		}		
		catch(ArithmeticException e)   
		{       
			System.out.println("n please check there is zero");
			//System.out.println(" Exception :"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("n Array index going out of bound ....");			
		}		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{//int x=15,y=5,a=5,z;
			//	int arr[] = {10,5};
		try
		{   
			int b = arr[4]/a;		
			z = 500/10;  //error 			
			System.out.println("z:" + z);
		    //System.out.println(" This will not be Executed if error occurs");
		}		
		catch(ArithmeticException e)   
		{       
			System.out.println("n please check there is zero");
			//System.out.println(" Exception :"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("n Array index going out of bound ....");			
		}		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
			System.out.println("You are in finally block");
		}
		System.out.println("n After catch block....");
		}
}
		
		//super class exp should come at last catch block 