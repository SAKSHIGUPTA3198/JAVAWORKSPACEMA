package com.lti.ArrayListDemos;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
	 Employee e1 = new Employee(101,"Jay",50000.00f);
	 Employee e2 = new Employee(102,"Vijay",60000.00f);
	 Employee e3 = new Employee(103,"Sanjay",70000.00f);
	 
	 
	 
	 List  myList = new ArrayList();
	 
	 myList.add(e1);
	 myList.add(e2);
	 myList.add(e3);
	 
	 Book b1= new Book(1111,"Java");
	 Book b21= new Book(1112,"Oracle");
	  myList.add(b1);
	  myList.add(b21);
	  
	  for(Object o : myList)
	  {
		  System.out.println(o);
	  }
	  
	  System.out.println("****************");
	  
	  Iterator it1 = myList.iterator(); //iterator
	  //traverse through all elements
	 // while(it1.hasNext())
	  {
		  System.out.println(it1.next());
	  }
	  
	 
	 
	
	 System.out.println(myList);
	 
	}

}
