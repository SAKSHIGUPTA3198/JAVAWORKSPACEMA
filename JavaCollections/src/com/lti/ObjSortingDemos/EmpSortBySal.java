package com.lti.ObjSortingDemos;

import java.util.Comparator;

import com.lti.ArrayListDemos.Employee;

public class EmpSortBySal implements Comparator<Employee>{

	@Override
    public int compare(Employee e1, Employee e2) 
    {
        if(e1.getEmpSal()< e2.getEmpSal()){
            return 1;
        } else {
            return -1;
        }
    }
}


