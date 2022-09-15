package com.category.product.entity;
import javax.persistence.Id;
import java.util.Set;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name = "category")
public class category {
	
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
 
    private String categoryName;
    private int userId;
    
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<productsTable> productstable;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", categoryName=" + categoryName + ", userId=" + userId + "]";
	}

	public category() {

	}

	public category(String categoryName, int userId) {
		this.categoryName=categoryName;
		this.userId=userId;
	}

}
