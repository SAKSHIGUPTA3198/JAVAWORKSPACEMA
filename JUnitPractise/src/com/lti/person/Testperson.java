package com.lti.person;
import junit.framework.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

public class Testperson {
	
	@Test
	public void GetFirstName(){
		Person p = new Person("Robart","King");
		assertEquals(p.getFirstName(),"Robert");
	}
	

//	public void GetFullName(){
//		System.out.println("From TestPerson1");
//		Person p = new Person("Robert","King");
//		assertEquals("Robert",p.getFullName());
//	}
//	

}
