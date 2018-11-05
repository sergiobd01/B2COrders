package com.orderService.dto;

public class CreateOrderResponse {
	
	private String salesOrderId;
	private String salesOrderStatus;
	private String salesOrderCreationDate;
	private double price;
	public String getSalesOrderId() {
		return salesOrderId;
	}
	public void setSalesOrderId(String salesOrderId) {
		this.salesOrderId = salesOrderId;
	}
	public String getSalesOrderStatus() {
		return salesOrderStatus;
	}
	public void setSalesOrderStatus(String salesOrderStatus) {
		this.salesOrderStatus = salesOrderStatus;
	}
	public String getSalesOrderCreationDate() {
		return salesOrderCreationDate;
	}
	public void setSalesOrderCreationDate(String salesOrderCreationDate) {
		this.salesOrderCreationDate = salesOrderCreationDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
