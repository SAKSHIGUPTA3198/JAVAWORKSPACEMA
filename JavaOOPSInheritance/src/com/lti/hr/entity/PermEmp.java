package com.lti.hr.entity;

public class PermEmp extends Person{
	int basicSal;
	
	public PermEmp() {
		super();
	}
	
	
	/*
	public int getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(int basicSal) {
		this.basicSal = basicSal;		
	}
	
	
	*/
	
	public PermEmp(int id, String name,int basicSal) {
		super(id, name);
		this.basicSal=basicSal;
		
	}
	
	//ref person(parent)  PermEmp(child)
	public PermEmp(int i, String string) {
		super(i,string);
	}
	
	public void calSal(){
		int tSal=basicSal+5000;
		System.out.println(tSal);
	 }
	
	

	@Override
	public String toString() {
		return "PermEmp :"+ id+" "+ name  +"  "+basicSal  ;
	}

	
	
	

}
