package com.godrej.interfacedemo;

public class PermEmpImpl implements IPerson {

	int empId;
	double basicSal;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}
	@Override
	public void calc() {
		
		double tSal=basicSal+1000;
        System.out.println("PermEmployee total sal\t"+tSal);
		
	}
	@Override
	public String toString() {
		return "PermEmpImpl [empId=" + empId + ", basicSal=" + basicSal + "]";
	}
	
	
	
	
}
