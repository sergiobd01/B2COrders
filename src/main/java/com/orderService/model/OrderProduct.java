package com.orderService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ORDERPRODUCT")
public class OrderProduct {
	
	@Id
	@Column(name = "IDORDERPRODUCT")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOrderProduct;
	
	@Column(name = "IDPRODUCT")
	private Long id;
	
	@Column(name = "IDORDER")
	private Long idOrder;
	
	@Column(name = "QUANTITY")
	private int quantity;
	
	public OrderProduct() {
		
	}

	public OrderProduct(Long idOrderProduct, Long id, Long idOrder, int quantity) {
		super();
		this.idOrderProduct = idOrderProduct;
		this.id = id;
		this.idOrder = idOrder;
		this.quantity = quantity;
	}

	public Long getIdOrderProduct() {
		return idOrderProduct;
	}

	public void setIdOrderProduct(Long idOrderProduct) {
		this.idOrderProduct = idOrderProduct;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long idProduct) {
		this.id = idProduct;
	}

	public Long getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
