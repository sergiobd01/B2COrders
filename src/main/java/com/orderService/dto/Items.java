package com.orderService.dto;

public class Items {
	
	private Long itemId;
	private String itemName;
	private String itemDescriptions;
	private Long transportType;
	private Long spectacleType;
	private Long lodgingType;
	private String arrivalDate;
	private String departureDate;
	private String sourceCity;
	private String targetCity;
	private double price;
	private Long quantity;
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Long getTransportType() {
		return transportType;
	}
	public void setTransportType(Long transportType) {
		this.transportType = transportType;
	}
	public Long getSpectacleType() {
		return spectacleType;
	}
	public void setSpectacleType(Long spectacleType) {
		this.spectacleType = spectacleType;
	}
	public Long getLodgingType() {
		return lodgingType;
	}
	public void setLodgingType(Long lodgingType) {
		this.lodgingType = lodgingType;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getSourceCity() {
		return sourceCity;
	}
	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}
	public String getTargetCity() {
		return targetCity;
	}
	public void setTargetCity(String targetCity) {
		this.targetCity = targetCity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public String getItemDescriptions() {
		return itemDescriptions;
	}
	public void setItemDescriptions(String itemDescriptions) {
		this.itemDescriptions = itemDescriptions;
	}
	
}
