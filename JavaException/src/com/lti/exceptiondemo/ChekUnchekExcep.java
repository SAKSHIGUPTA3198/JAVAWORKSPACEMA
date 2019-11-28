package com.lti.exceptiondemo;

public class ChekUnchekExcep {

	public static void main(String[] args) {
		
		int k=1000;
		try
		{
		int i=0;
		int j=500/i;
		
		System.out.println(" j="+j);
		}
		catch(ArithmeticException e)
		{
			System.out.println("plz check you are dividing by zero");	
		}
		System.out.println("k=" + k);

		//BufferedReader br = new Buffered
		
		
	}

}
