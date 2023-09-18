package com.agrishop.agroshop.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data

public class Product {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nameProduct;
	private String description;
	private String image;
	private double price;
	
	
	
	@OneToMany(mappedBy="products")
	private List<Farmer>farmers;
	
	@OneToMany(mappedBy="product")
	 private List<ProductBasket> productBasket;
	
	
	
	//@ManyToOne
	//@JoinColumn(name="Stock_id")
	//private Stock stocks;
	
	@ManyToMany(mappedBy="products")
	private Set<Stock>stocks=new HashSet<>();
	
	@ManyToMany(mappedBy="products")
	 private Set<Command>commands=new HashSet<>();

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description1) {
		this.description = description1;
	}

	
	public long getId() {
		
		return this.id;
	}

	public void setId(long id2) {
		
		this.id=id2;
		
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct1) {
		this.nameProduct = nameProduct1;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price1) {
		this.price = price1;
	}

	
}
