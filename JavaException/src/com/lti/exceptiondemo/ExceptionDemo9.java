package com.lti.exceptiondemo;


/* Program to Demonstrates 'Own exception' */

public class ExceptionDemo9
{
	 static void evenodd(int number) throws OwnException
	{
		System.out.println("n c alled evenodd ("+number+")");
		
		if(number%2==0)
					System.out.println("Normal Exit....Number is Even ");
		else
			throw new OwnException(number); 
	}		
	public static void main(String args[]) 
	{			
				try 
				{
					evenodd(22);
				} catch (OwnException e)
				{
					System.out.println(e);
				}
			
	}
}
					
		







