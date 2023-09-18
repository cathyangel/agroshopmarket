package com.agrishop.agroshop.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private String nameCustomer;
	
	
	
	@OneToOne(mappedBy="customer")
	private User user;
	
	
	@ManyToOne
	@JoinColumn(name="command_id", referencedColumnName="id", nullable=false)
	private Command commands;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="basket_id")
	private Basket basket;
	
	@OneToMany(mappedBy="customer")
	private List<Farmer>farmers;
	
	public long getId() {
		return id;
	}
	public void setId(long id2) {
		this.id=id2;
	}
	public String getNameCustomer() {
		return nameCustomer;
	}
	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}
	
}