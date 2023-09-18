package com.agrishop.agroshop.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Basket {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private int quantity;
	private String description;
	private double totalPrice;
	private int priceUnit;
	
	
	
	@OneToOne(mappedBy="basket")
	private Customer customer;
	
	
	@OneToMany(mappedBy="basket")
	 private List<ProductBasket>  productBasket;
	
	
	//@ManyToMany
	//@JoinTable(name="basket_product", joinColumns=@JoinColumn(name="basket_id"),
	  //inverseJoinColumns=@JoinColumn(name="product_id"))private Set<Product>products=new HashSet<>();
	
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getId() {
		
		return this.id;
	}
	public void setId(long id2) {
		 this.id=id2;
		
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
