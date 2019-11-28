package com.lti.ObjSortingDemos;
import java.util.Collections;
import java.util.List;
import com.lti.ArrayListDemos.Employee;
import java.util.*;
public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1= new Employee(105,"vijay",4000);
Employee e2= new Employee(101,"Sanjay",9000);
Employee e3= new Employee(103,"jay",6000);
	
	
	List<Employee> myList  = new ArrayList<>();
	myList.add(e1);
	myList.add(e2);
	myList.add(e3);
	
	 	System.out.println("Before Sort");
	
	for(Employee e :myList){
		System.out.println(e);
	}
	
	Collections.sort(myList,new EmpSortById());
	System.out.println("After Sort by ID");
	for(Employee e:myList){
		System.out.println(e);
	}
	
	Collections.sort(myList,new EmpSortBySal());
	System.out.println("After Sort by sal");
	
	for(Employee e:myList){
		System.out.println(e);
	}	

}
}
