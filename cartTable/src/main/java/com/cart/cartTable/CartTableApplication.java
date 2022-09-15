package com.cart.cartTable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "cart_tble")
public class CartTableApplication {

	 @Id
	  	@GeneratedValue (strategy = GenerationType.IDENTITY)
	    private Long cartId;

	    @Column (name = "cartId", length = 30)
	    @NotNull
	    private int cartid;
	    
	    
	    @Column(name = "productId", length = 30)
	    @NotNull
	    private int productId;

	    @Column(name = "userId", length = 30)
	    @NotNull
	    private int userId;
	    
		public Long getcartId() {
			return cartId;
		}

		public void setcartId(Long cartId) {
			this.cartId = cartId;
		}


		public int getproductId() {
			return productId;
		}

		public void setproductId(int productId) {
			this.productId = productId;
		}
		
		public int getuserId() {
			return userId;
		}

		public void setuserId(int userId) {
			this.userId = userId;
		}
}
