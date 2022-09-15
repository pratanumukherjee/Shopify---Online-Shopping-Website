package com.user.userservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer userId;
	 private String userName;
	 private String firstName;
	 private  String lastname;
	 private String email;
	 private String password;	 
	 
	 @OneToMany
	 @JoinColumn(name ="roleId")
	 private UserRole userrole;

	 
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer userId, String userName, String firstName, String lastname, String email, String password,
			UserRole userrole) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.userrole = userrole;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRole getUserrole() {
		return userrole;
	}

	public void setUserrole(UserRole userrole) {
		this.userrole = userrole;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName + ", lastname="
				+ lastname + ", email=" + email + ", password=" + password + ", userrole=" + userrole + "]";
	}
	 
	 
}