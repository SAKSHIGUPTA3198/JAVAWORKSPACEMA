package com.godrej.interfacedemo;

public class TempEmpImpl implements IPerson {
	
	int tempId;
	double salPerDay;
	int noDays;
	
	
	public int getTempId() {
		return tempId;
	}
	public void setTempId(int tempId) {
		this.tempId = tempId;
	}
	public double getSalPerDay() {
		return salPerDay;
	}
	public void setSalPerDay(double salPerDay) {
		this.salPerDay = salPerDay;
	}
	public int getNoDays() {
		return noDays;
	}
	public void setNoDays(int noDays) {
		this.noDays = noDays;
	}
	@Override
	public String toString() {
		return "TempEmpImpl [tempId=" + tempId + ", salPerDay=" + salPerDay + ", noDays=" + noDays + "]";
	}
	
	
public void calc() {
		
		double tSal=salPerDay*noDays;
        System.out.println("Temp Employee total sal\t"+tSal);
		
	}
	
	
	

}
