package com.lti.exceptiondemo;
	/* Program to Demonstrates 'Own exception' */
	class OwnException extends Exception
	{
		private int no;	
		OwnException(int no1)
		{
			no=no1;
		}
		public String toString()
		{
			return "ownException Odd Number("+no+")";
		}
	}
	
	
	
	
	
	


