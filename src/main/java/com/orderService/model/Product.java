package com.orderService.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "PRODUCT")
public class Product {
	
	@Id
	@Column(name = "IDPRODUCT")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduct;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "IDTRANSPORT")
	private Long idTransport;
	
	@Column(name = "IDENTERTAINMENT")
	private Long idEntertainment;
	
	@Column(name = "IDHOTEL")
	private Long idHotel;
	
	@Column(name = "ARRIVAL_DATE")
	private Date arrivalDate;
	
	@Column(name = "DEPARTURE_DATE")
	private Date departureDate;
	
	@Column(name = "SOURCE_CITY")
	private Long sourceCity;
	
	@Column(name = "TARGET_CITY")
	private Long targetCity;
	
	@Column(name = "PRICE")
	private Long price;

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getIdTransport() {
		return idTransport;
	}

	public void setIdTransport(Long idTransport) {
		this.idTransport = idTransport;
	}

	public Long getIdEntertainment() {
		return idEntertainment;
	}

	public void setIdEntertainment(Long idEntertainment) {
		this.idEntertainment = idEntertainment;
	}

	public Long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Long getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(Long sourceCity) {
		this.sourceCity = sourceCity;
	}

	public Long getTargetCity() {
		return targetCity;
	}

	public void setTargetCity(Long targetCity) {
		this.targetCity = targetCity;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}
	
}
