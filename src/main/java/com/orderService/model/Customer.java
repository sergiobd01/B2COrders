package com.orderService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Customer")
public class Customer {
	
	@Id
	@Column(name = "IDCUSTOMER")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCustomer;
	
	@Column(name = "IDCATEGORY")
	private Long idCategory;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "USERNAME")
	private String userName;
	
	public Customer() {
	}

	public Customer(Long idCustomer) {
		super();
		this.idCustomer = idCustomer;
	}

	public Long getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}

	public Long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
