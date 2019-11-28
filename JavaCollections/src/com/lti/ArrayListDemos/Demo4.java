package com.lti.ArrayListDemos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo4 {

	public static void main(String[] args) {
		Set mySet= new HashSet();
		
		Book b1 = new Book(101,"java");
		Book b2 = new Book(101,"java");
		mySet.add(b1);
		mySet.add(b2);
		
		System.out.println(b1.hashCode());
		
		mySet.add(700);
		mySet.add(300);
		mySet.add(100);
		mySet.add(200);
		mySet.add(100);
        
		
		System.out.println(mySet);
		
		Set tset= new TreeSet();
		
		tset.add(3000);
		tset.add(2000);
		tset.add(2500);
		tset.add(2000);
		
		System.out.println(tset);
		
		
		
		
	//	System.out.println(mySet);	

	}

}
