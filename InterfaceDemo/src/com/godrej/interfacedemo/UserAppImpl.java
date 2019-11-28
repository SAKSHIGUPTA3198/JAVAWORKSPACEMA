package com.godrej.interfacedemo;

public class UserAppImpl {

	public static void main(String[] args) {
		
		//permanent emp obj
		
		PermEmpImpl pemp = new PermEmpImpl();
		
		pemp.setBasicSal(10000);
		pemp.setEmpId(1111);
		
		pemp.calc();
		
		/************/
		//temporary emp object
		
		
		TempEmpImpl temp = new TempEmpImpl();
		
		temp.setTempId(2222);
		temp.setNoDays(20);
		temp.setSalPerDay(500.00f);
		
		temp.calc();
		//dynamic interface
;
		
		IPerson p;
		
		p=pemp;
		p.calc();
		
		p=temp;
		p.calc();
		
		
		
		
		
	}

}
