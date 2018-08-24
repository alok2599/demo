package com.test.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.dao.model.Category;

public interface CategoryInventory extends JpaRepository<Category, Long> {

	public Category findByCategoryCode(String code);
	public Category findByCategoryName(String name);
}
