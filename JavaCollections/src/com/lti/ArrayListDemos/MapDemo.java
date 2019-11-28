package com.lti.ArrayListDemos;
import  java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//value - duplicate
		 Map<String,String> mailIds = new HashMap<String,String>(); 	        
		 mailIds.put("user1@gmail.com", "password1"); 
		 mailIds.put("user2@gmail.com", "password1"); 
		 mailIds.put("user1@gmail.com", "password3"); 
		 
		//we cannot iterate a Map directly using iterators,
		//because Map are not Collection
		
	
		 
		 
		 for (Map.Entry<String, String> entry : mailIds.entrySet())  
         {
	        	
	       System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
			
            }

		    
	     HashMap<Integer, Book> prdList = new HashMap<>();
			 
			// Product p1= new Product( 101,  "TShirt", 1_200, 5 );
			// Product p2= new Product( 102, "Saree", 3_0000, 3 );
			Book b1= new Book(101,"Java");
			Book b2= new Book(102,"Oracle");
			 
			prdList.put(1111, b1);
			prdList.put(1112,b2);		 
		
			
			 for (Map.Entry<Integer, Book> entry : prdList.entrySet())  
		        	
	System.out.println("Key = " + entry.getKey() +  ", Value = " + entry.getValue()); 
    

	}

}
