package com.orderDetails.application;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "order")
public class order {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long orderid;

    @Column (name = "orderId", length = 30)
    private int orderId;
    @Column (name = "productId", length = 30)
    private int productId;
    @Column (name = "addressId", length = 30)
    private int addressId;
    @Column (name = "userId", length = 30)
    private int userId;
    @Column (name = "statusId", length = 30)
    private int statusId;
    @Column (name = "ordered_date")
    @NotNull
    private LocalDate orderedDate;
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "user_id")
    private order user;
    
    @OneToOne(mappedBy = "order")
	@JsonIgnore 
    private order order;

	public order() {
	}

	public Long getOrderId() {
		return orderid;
	}

	public void setorderId(Long orderId) {
		this.orderid = orderId;
	}


	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	
	public LocalDate getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(LocalDate orderedDate) {
		this.orderedDate = orderedDate;
	}
	
	public order getUser() {
		return user;
	}

	public void setUser(order user) {
		this.user = user;
	}

}
