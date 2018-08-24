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
@Table(name = "CATEGORY")
public class Category {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)//, generator = "user_seq")
	//@SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
	private Long id;

	@Column(name = "CATEGORY_NAME", length = 50, unique = true)
	@NotNull
	@Size(min = 4, max = 50)
	private String categoryName;

	@Column(name = "CATEGORY_CODE", length = 50)
	@NotNull
	@Size(min = 4, max = 50)
	private String categoryCode;

	 

	 
}
