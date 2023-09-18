package com.agrishop.agroshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Farmer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String licence;
	private String  nationalCard;
	private String localisation;
	private String  photo;
	

	
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Product getProducts() {
		return products;
	}
	public void setProducts(Product products) {
		this.products = products;
	}
	public Command getCommands() {
		return commands;
	}
	public void setCommands(Command commands) {
		this.commands = commands;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@OneToOne(mappedBy="farmer")
	private User user;
	
	
	@ManyToOne
	@JoinColumn(name="product_id",referencedColumnName="id",nullable=false)
	private Product products;
	
	
	@ManyToOne
	@JoinColumn(name="command_id", referencedColumnName="id")
	private Command commands;
	
	@ManyToOne
	@JoinColumn(name="customer_id", referencedColumnName="id")
	private Customer customer;
	
	public long getId() {
		return id;
	}
	public void setId(long id2) {
		this.id=id2;
	}
	
	public String getLicence() {
		return licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}
	public String getNationalCard() {
		return nationalCard;
	}
	public void setNationalCard(String nationalcard) {
		nationalCard = nationalcard;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
		
	
}