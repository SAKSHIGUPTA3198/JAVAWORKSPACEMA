package com.lti.shop.entity;

public class Product {
	
	int prdId;
	String productName;
	double prdCost;
	
	public Product() {
		super();
	}

	public Product(int prdId, String productName, double prdCost) {
		super();
		this.prdId = prdId;
		this.productName = productName;
		this.prdCost = prdCost;
	}
	
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrdCost() {
		return prdCost;
	}
	public void setPrdCost(double prdCost) {
		this.prdCost = prdCost;
	}
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", productName=" + productName + ", prdCost=" + prdCost + "]";
	}
	
	

}



