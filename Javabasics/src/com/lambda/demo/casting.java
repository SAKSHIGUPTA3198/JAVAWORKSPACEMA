package com.lambda.demo;

public class casting {
	
	
	
	
	
	

class Parent
{
	int property=999999;    
	
	void shopping()
    {
        System.out.println("parent card money :" +property);
    }
}
 class Child extends Parent{
	 
	int sal=100000;
   
	 void shopping(){
	        System.out.println("shopping via sal :" + sal + " via property also " + property );
	    }
}
  
public class ParentChild {
 
    public static void main(String[] args) {
    	  	
    	
    	Parent p =new Child();// upcasting
    	p.shopping();
       
       System.out.println("n");
      
       
    //   Child c = new Parent();  //downcasting not possible 
             
      Parent p1 = new Child();
    	
      Child c =(Child) p1;
   c.shopping();
      
    }
}









	
	
	
	
	

}
