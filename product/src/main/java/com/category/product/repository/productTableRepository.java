package com.category.product.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.category.product.entity.category;
import com.category.product.entity.productsTable;



public interface productTableRepository extends JpaRepository<productsTable, Long>{
	
	List<productsTable> findBycategory(category Category, Sort sort);


}
