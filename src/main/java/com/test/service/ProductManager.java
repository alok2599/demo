package com.test.service;

import com.test.dao.model.Category;
import com.test.dto.ProductDTO;

public abstract class ProductManager {

	private String productCode;
	private String productName;
	private Category productCategory;
	private Double price;
	private Integer quantity;
	
	public abstract ProductDTO edit(ProductDTO product);
		
}
