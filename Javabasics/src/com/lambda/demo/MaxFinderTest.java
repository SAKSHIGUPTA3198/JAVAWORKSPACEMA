package com.lambda.demo;

public class MaxFinderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxFinder obj =(num1,num2) -> num1>num2?num1:num2;
		
		double result = obj.maximum(35.5, 20.5);
		System.out.println(result);
		
		
		
	}

}
