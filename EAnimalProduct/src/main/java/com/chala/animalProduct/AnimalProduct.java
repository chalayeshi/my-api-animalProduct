package com.chala.animalProduct;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AnimalProduct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double pricePerPiece;
	private String urlPicture;
	private int minOrder;
	
	
	public AnimalProduct(Long id, String name, Double pricePerPiece, String urlPicture, int minOrder) {
		super();
		this.id = id;
		this.name = name;
		this.pricePerPiece = pricePerPiece;
		this.urlPicture = urlPicture;
		this.minOrder = minOrder;
	}

	public AnimalProduct() {
		
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPricePerPiece() {
		return pricePerPiece;
	}


	public void setPricePerPiece(Double pricePerPiece) {
		this.pricePerPiece = pricePerPiece;
	}


	public String getUrlPicture() {
		return urlPicture;
	}


	public void setUrlPicture(String urlPicture) {
		this.urlPicture = urlPicture;
	}


	public int getMinOrder() {
		return minOrder;
	}


	public void setMinOrder(int minOrder) {
		this.minOrder = minOrder;
	}
	
}
