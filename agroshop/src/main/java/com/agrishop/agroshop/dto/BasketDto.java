package com.agrishop.agroshop.dto;

import lombok.Data;


@Data
public class BasketDto {
    private long id;
	private int quantity;
	private String description;
	private double totalPrice;
	private int priceUnit;
	
	
	
	
	
	public void setQuantity(int quantity2) {
            this.quantity=quantity2;
		
	}
	public void setDescription(String description2) {
		 this.description=description2;
		
	}
	public int getQuantity() {
		// TODO Auto-generated method stub
		return this.quantity;
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}
	public void setId(long id2) {
		this.id=id2;
		
	}
	public long getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getPriceUnit() {
		return priceUnit;
	}
	public void setPriceUnit(int priceUnit) {
		this.priceUnit = priceUnit;
	}
}
