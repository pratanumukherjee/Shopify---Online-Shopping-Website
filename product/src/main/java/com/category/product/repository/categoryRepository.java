package com.category.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.category.product.entity.category;

@Repository
public interface categoryRepository extends JpaRepository<category, Long>{
	

}
