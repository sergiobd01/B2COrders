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
	
	

}
