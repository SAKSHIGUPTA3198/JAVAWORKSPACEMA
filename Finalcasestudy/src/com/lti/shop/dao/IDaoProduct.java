package com.lti.shop.dao;

import java.util.*;

import com.lti.shop.entity.Product;

public interface IDaoProduct {

	public abstract void addProducts(Product p);
	public abstract List<Product>getAllProducts();
	public abstract Product showProduct(int prdNo);
	
}
