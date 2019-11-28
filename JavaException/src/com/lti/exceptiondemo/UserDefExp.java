package com.lti.exceptiondemo;

public class UserDefExp {

		public static void main(String ar[]) throws NumException 
			{
				int n1,n2,result;
				n1=100;
				n2=0;			
						result = calDiv(n1, n2);
						System.out.println(result);
				
			}
			public static int calDiv(int num1, int num2) throws NumException
			{
				if (num2==0)
					throw new NumException();// new object of your own class is being thrown 
				else
					return num1/num2;
			}
		}
		//user defined or own exception class MyExp /UserExp
		class NumException extends Exception
		{
			public String getMessage()
			{
				return "Please check n2 has value zero";
			}
}


