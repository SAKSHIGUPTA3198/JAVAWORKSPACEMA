package com.lti.ArrayListDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	List myList= new ArrayList();
	
	int i=sc.nextInt();
	myList.add(i);
	
	myList.add(100);
	myList.add(400);
	myList.add(300);
	myList.add(200);
	myList.add("Jay");
	 myList.add(7000.00);
	
	System.out.println(myList);
	
	myList.remove(2);
	myList.remove("Jay");
	
	System.out.println(myList);
	myList.add(3,300);
	
	System.out.println(myList);
	
    //Collections.sort(myList);
	System.out.println(myList);
	
	
		
	}

}
