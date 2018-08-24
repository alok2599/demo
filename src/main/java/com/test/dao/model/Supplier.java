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
@Table(name = "SUPPLIER")
public class Supplier {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)//, generator = "user_seq")
	//@SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
	private Long id;

	@Column(name = "SUPPLIER_NAME", length = 50, unique = true)
	@NotNull
	@Size(min = 4, max = 50)
	private String supplierName;

	@Column(name = "SUPPLIER_CODE", length = 50)
	@NotNull
	@Size(min = 4, max = 50)
	private String supplierCode;

	@Column(name = "FIRSTNAME", length = 50)
	@NotNull
	@Size(min = 4, max = 50)
	private String firstname;

	@Column(name = "LASTNAME", length = 50)
	@NotNull
	@Size(min = 4, max = 50)
	private String lastname;

	@Column(name = "EMAIL", length = 50)
	@NotNull
	@Size(min = 4, max = 50)
	private String email;

	 
}
