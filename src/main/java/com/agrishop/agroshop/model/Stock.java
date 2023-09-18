package com.agrishop.agroshop.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Stock {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private int quantity;
	private double price;
	
	
	
	
	
	
	
	@ManyToMany
	@JoinTable(name="stock_product", joinColumns=@JoinColumn(name="stock_id", nullable=false),
	  inverseJoinColumns=@JoinColumn(name="product_id",nullable=false))private Set<Product>products=new HashSet<>();
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getId() {
		
		return this.id;
	}
	public void setId(long id2) {
		this.id=id2;
		
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	
	
	
}
