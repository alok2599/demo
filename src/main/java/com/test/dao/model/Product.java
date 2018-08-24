package com.test.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

 

@Entity
@Table(name = "PRODUCT")
public class Product {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)//, generator = "user_seq")
	//@SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
	private Long id;

	@Column(name = "PRODUCT_NAME", length = 50, unique = true)
	@NotNull
	@Size(min = 4, max = 50)
	private String productName;

	@Column(name = "PRODUCT_CODE", length = 50)
	@NotNull
	@Size(min = 4, max = 50)
	private String productCode;

	@Column(name = "BRAND_NAME", length = 50)
	@NotNull
	@Size(min = 4, max = 50)
	private String brandName;

	@Column(name = "SUPPLIER_CODE", length = 50)
	@NotNull
	@Size(min = 4, max = 50)
	private String supplierCode; 
	
	@Column(name = "CATEGORY_CODE", length = 50)
	@NotNull
	@Size(min = 4, max = 50)
	private String categoryCode;
	
	@Column(name = "PRICE", length = 50)
	@NotNull
	@Size(min = 4, max = 50)
	private String price;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	
	
	
	
	 
}
