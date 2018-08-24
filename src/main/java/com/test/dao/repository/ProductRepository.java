package com.test.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.dao.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	   
	public Product findByProductCode(String code);
	public Product findByProductName(String name);
	public Product save(Product product);
	
	
	}
