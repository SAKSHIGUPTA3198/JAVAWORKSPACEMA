package com.lti.oops.user;

public class Product {
	
String brandName;
int barcode;
String pname;
float cost;





public int getBarcode() {
	return barcode;
}
public void setBarcode(int barcode) {
	this.barcode = barcode;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public float getCost() {
	return cost;
}
public void setCost(float cost) {
	this.cost = cost;
}



public Product(int barcode, String pname, float cost) {
	super();
	this.brandName="LTI";
	this.barcode = barcode;
	this.pname = pname;
	this.cost = cost;
}

public Product() {

	this.brandName="LTI";
}
@Override
public String toString() {
	return "Product [brandName=" + brandName + ", barcode=" + barcode + ", pname=" + pname + ", cost=" + cost + "]";
}




public void giveIncr(int i) {
	
	float total_bill;
	total_bill=this.cost+i;
	System.out.println("the total bill is "+total_bill);
	
	// TODO Auto-generated method stub
	
}




public void CalBill(int quantity){
	int quant = quantity;
	float bill;
	bill = quant*this.cost;
	System.out.println(bill);
	
	
	
}


















}
