package com.lti.basics.demos;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int age=98;
//		String ans;
//		ans = (age > 18)? "You can vote":"you can't vote";
//		System.out.println(ans);
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d;
		a=sc.nextInt();
		b=sc.nextInt();
        c=sc.nextInt();
        d=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(d);

	}

}
