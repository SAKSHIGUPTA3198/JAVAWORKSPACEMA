package com.lti.shopping.services;

import com.lti.shopping.dao.IDaoProduct;
import com.lti.shopping.dao.ImplDaoProduct;

public class ImplProduct implements IProduct {
	private IDaoProduct serviceDao;
	public ImplProduct()
	{
		serviceDao=new ImplDaoProduct();
		
	}
	

}
