package com.test.service;

public interface Inventory {
	
	public void add(ProductManager product);
	public void remove(ProductManager product, Double quantity);
	public void hold(ProductManager product, Double quantity);
 
	
}
