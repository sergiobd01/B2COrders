package com.orderService.model;

public class CreditCard {
	

	private String cvv;
	
	private int expirationMonth;
	
	private int expirationYear;
	
	private long numberCard;
	


	public CreditCard(long numberCard, String cvv, int expirationMonth, int expirationYear) {
		this.numberCard = numberCard;
		this.cvv = cvv;
		this.expirationMonth = expirationMonth;
		this.expirationYear = expirationYear;
	}

	public long getNumberCard() {
		return numberCard;
	}


	public void setNumberCard(long numberCard) {
		this.numberCard = numberCard;
	}


	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public int getExpirationMonth() {
		return expirationMonth;
	}

	public void setExpirationMonth(int expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	public int getExpirationYear() {
		return expirationYear;
	}

	public void setExpirationYear(int expirationYear) {
		this.expirationYear = expirationYear;
	}

}
