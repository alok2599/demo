package com.test.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

 import com.test.dao.model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

	public Supplier findBySupplierCode(String code);
	public Supplier findBySupplierName(String name);
}
