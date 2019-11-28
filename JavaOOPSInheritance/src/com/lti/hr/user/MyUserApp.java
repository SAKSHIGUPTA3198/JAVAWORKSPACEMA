package com.lti.hr.user;

import com.lti.hr.entity.PermEmp;
import com.lti.hr.entity.Person;
import com.lti.hr.entity.TempEmp;

public class MyUserApp {

	public static void main(String[] args) {
		
	
		
//	    Person p1 = new Person(1000,"ABC");
//		System.out.println(p1);
//		p1.calSal();
		
		
		
		//get/set
	/*	PermEmp pe= new PermEmp();
		pe.setId(101);
		pe.setName("jay");
		pe.setBasicSal(50000);
		System.out.println(pe);
	*/	
		
		//constructor
		PermEmp pe1=new PermEmp(102,"vijay",6000);
		System.out.println(pe1);
		pe1.show();
		pe1.calSal();
		
		TempEmp te=new TempEmp(102,"sanjay",10,5000);
		System.out.println(te);
		
		te.calSal();

	}

}
