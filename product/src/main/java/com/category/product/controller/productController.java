package com.category.product.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.category.product.entity.category;
import com.category.product.entity.productsTable;
import com.category.product.repository.categoryRepository;
import com.category.product.repository.productTableRepository;





@RestController
public class productController {
	
	@Autowired
	private categoryRepository categoryrepository;
	private productTableRepository productTablerepository;

	
	@PostMapping("/savecategoryName")
	public category savecategoryName(@RequestBody category cat) {
		return this.categoryrepository.save(cat);
	}
	
	@GetMapping("/showcategoryName")
	public List<category> getAllcategoryName(){
		return this.categoryrepository.findAll();
	}
	
	@GetMapping("/showproductName")
	public List<productsTable> getAllproductName(){
		return this.productTablerepository.findAll();
	}
	
	@GetMapping("/showproductPrice")
	public List<productsTable> getAllproductPrice(){
		return this.productTablerepository.findAll();
	}

}
