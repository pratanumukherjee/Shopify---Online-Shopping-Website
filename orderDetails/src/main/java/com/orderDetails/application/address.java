package com.orderDetails.application;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table (name = "address")
public class address {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long addressid;

    @Column (name = "addressId", length = 30)
    private int addressId;
    @Column (name = "address", length = 255)
    private String Address;
    @Column (name = "landmark", length = 45)
    private String landmark;
    @Column (name = "city", length = 30)
    private String city;
    @Column (name = "pincode", length = 6)
    private int pincode;
    @Column (name = "country", length = 10)
    private String country;
    @Column (name = "userId", length = 30)
    private int userId;

    @OneToOne(mappedBy = "address")
	@JsonIgnore 
    private address address;

	public address() {
	}

	public Long getaddressId() {
		return addressid;
	}

	public void setaddressId(Long addressId) {
		this.addressid = addressId;
	}


	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public int getPincode() {
		return pincode;
	}

	public void setPincode(int Pincode) {
		this.pincode = Pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getUserId() {
		return userId;
	}

	public void setUser(int userId) {
		this.userId = userId;
	}
}
