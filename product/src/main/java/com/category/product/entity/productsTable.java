package com.category.product.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Id;



@Entity
@Table(name = "productstable")
public class productsTable implements Serializable {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    private String productName;
	    private int productPrice;
	    private int productQuantity;
	    private int productDiscount;
	    private int productImage;
	    private int categoryId;
	    
	    
	    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "categoryId", nullable = false)
	    
	    private category Category;
	    
	    public productsTable() {
	    	
	    }

		public productsTable(int id, String productName, int productPrice, int productQuantity, int productDiscount,
				int productImage, int categoryId, category Category) {
			super();
			this.id = id;
			this.productName = productName;
			this.productPrice = productPrice;
			this.productQuantity = productQuantity;
			this.productDiscount = productDiscount;
			this.productImage = productImage;
			this.categoryId = categoryId;
			this.Category = Category;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public int getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(int productPrice) {
			this.productPrice = productPrice;
		}

		public int getProductQuantity() {
			return productQuantity;
		}

		public void setProductQuantity(int productQuantity) {
			this.productQuantity = productQuantity;
		}

		public int getProductDiscount() {
			return productDiscount;
		}

		public void setProductDiscount(int productDiscount) {
			this.productDiscount = productDiscount;
		}

		public int getProductImage() {
			return productImage;
		}

		public void setProductImage(int productImage) {
			this.productImage = productImage;
		}

		public int getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(int categoryId) {
			this.categoryId = categoryId;
		}

		public category getProduct() {
			return Category;
		}

		public void setProduct(category Category) {
			this.Category = Category;
		}

		@Override
		public String toString() {
			return "productsTable [id=" + id + ", productName=" + productName + ", productPrice=" + productPrice
					+ ", productQuantity=" + productQuantity + ", productDiscount=" + productDiscount + ", categoryId="
					+ categoryId + ", product=" + Category + "]";
		}


	    

}
