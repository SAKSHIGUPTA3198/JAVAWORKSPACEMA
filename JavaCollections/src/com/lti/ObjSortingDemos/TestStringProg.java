package com.lti.ObjSortingDemos;

public class TestStringProg {
	
char x='p';
	
	String word;

    //assign the string to the variable:
    word = "Alexander";
    //preform some actions on the string:

    //1. retrieve the length by calling the
    //length method:
   
    int length = word.length();
    System.out.println("Length: " + length);

    //2. use the case functions:
    System.out.println("toUpperCase: " + word.toUpperCase());
    System.out.println("toLowerCase: " + word.toLowerCase());

    //3. use the trim function to eliminate leading
    //or trailing white spaces:
    word = word.trim();
    System.out.println("trim:" + word);

    //4. check for a certain character using indexOf()
    System.out.println("indexOf('e'): " + word.indexOf('e'));    
    System.out.println("Last 'e' is located at index "+word.lastIndexOf('e'));
  
    //5. print out the beginning character using charAt()
    System.out.println("first character: " + word.charAt(5));

    //6. make the string shorter   

	 word = word.substring(3,8);
	 System.out.println("shorter string: " + word);
   
	 	 
    String s1 =new String("Happy");
	String s2 =new String("Birthday");		
	String s3=s1+s2;
	System.out.println(s3);
	
	
	String s4=s1.concat(s2);
	
	
	
	

}}
