package com.lti.ObjSortingDemos;

import java.util.Comparator;
import com.lti.ArrayListDemos.Employee;


public class EmpSortById implements Comparator<Employee>{

		@Override
	    public int compare(Employee e1, Employee e2) 
	    {
	        if(e1.getEmpId()< e2.getEmpId()){
	            return 1;
	        } else {
	            return -1;
	        }
	    }
	}
	
	
	
