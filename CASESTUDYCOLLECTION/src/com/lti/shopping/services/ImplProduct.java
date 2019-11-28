package com.lti.shopping.services;
import java.util.*;
import java.util.List;

import com.lti.shopping.entity.Product;
import com.lti.shopping.user.IProduct;

public class ImplProduct implements IProduct {

	
	List<Product> myList = new ArrayList<Product>();
	@Override
	public List<Product> addProduct(Product p) {
	
	
		myList.add(p);
		return myList;
		
	
	}
	
	
}
