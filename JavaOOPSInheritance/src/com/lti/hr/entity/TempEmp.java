package com.lti.hr.entity;

public class TempEmp  extends Person{
	int noDays;
	int perDaySal;
	
	public TempEmp() {
		super();
		
	}
	
	public void calSal(){
		int tSal=noDays*perDaySal;
		System.out.println(tSal);
	 }
	
	
	public TempEmp(int id, String name,int noDays,int perDaySal) {
		super(id, name);
		this.noDays=noDays;
		this.perDaySal=perDaySal;
	}
	@Override
	public String toString() {
		return "TempEmp [noDays=" + noDays + ", perDaySal=" + perDaySal + ", id=" + id + ", name=" + name + "]";
	}
	
	
		
	
	
	

}
