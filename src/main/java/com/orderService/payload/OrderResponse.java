package com.orderService.payload;

public class OrderResponse {

	
	private String message;
	

	public OrderResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
	
}
