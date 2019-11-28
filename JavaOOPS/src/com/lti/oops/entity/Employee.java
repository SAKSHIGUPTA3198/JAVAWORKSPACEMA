package com.lti.oops.entity;

public class Employee {
	 
	 public String cName;
	   public int empId;
	  public String empName;
	  public float empSal;
	  	 
	//constructor  
	  
	public int getEmpId() {
		return empId;
	}
	public Employee(String cName,int empId, String empName, float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	
	
	public void setEmpId(int empId) { //this line we have to always write
		this.empId = empId;
	}
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
	
	
	
	
	  
//	  public void set(int empId,String empName,float empSal){
//		  
//		this.empId=empId;  
//		this.empName=empName;
//		this.empSal=empSal;
//		
//		//System.out.println(e1);
//		  
//	  }
	  
	  
	 
	
	

}
