package com.orderService.payload;

public class OrderResponse {

	
	private String message;
	
	private boolean success;
	

	public OrderResponse(String message, boolean success) {
		this.message = message;
		this.success = success;
	}

	
	public boolean isSuccess() {
		return success;
	}


	public void setSuccess(boolean success) {
		this.success = success;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
	
}
