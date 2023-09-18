package com.agrishop.agroshop.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Command {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nameCommand;
	private String description;
	private double totalMontant;
	private String paiementMethod;
	private float tva;
	
	
	
	
	@ManyToMany
	@JoinTable(name="command_product", joinColumns=@JoinColumn(name="command_id"),
	  inverseJoinColumns=@JoinColumn(name="product_id"))private Set<Product>products=new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name="user_id",referencedColumnName="id",nullable=false )
	private User users;
	
	
	
	@OneToMany(mappedBy="commands")
	private List<Farmer> farmers;
	
	
	@OneToMany(mappedBy="commands")
	private List<Customer>customers;
	
	@OneToMany(mappedBy="commands")
	private List<Transporter>transporters;
	
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public void setId(long id2) {
		// TODO Auto-generated method stub
	     this.id=id2;
	}

	

	public double getTotalMontant() {
		return totalMontant;
	}

	public void setTotalMontant(double totalMontant) {
		this.totalMontant = totalMontant;
	}

	public String getPaiementMethod() {
		return paiementMethod;
	}

	public void setPaiementMethod(String paiementMethod) {
		this.paiementMethod = paiementMethod;
	}

	public float getTva() {
		return tva;
	}

	public void setTva(float tva) {
		this.tva = tva;
	}

	public String getNameCommand() {
		return nameCommand;
	}

	public void setNameCommand(String nameCommand) {
		this.nameCommand = nameCommand;
	}

	public long getId() {
	
		return id;
	}

	

	
}
