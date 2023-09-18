package com.agrishop.agroshop.dto;

import lombok.Data;


@Data
public class CommandDto {
	private long id;
	private String nameCommand;
	private String description;
	private double totalMontant;
	private String paiementMethod;
	private float tva;
	
	
	
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setId(long id2) {
		  this.id=id2;
		
	}
	public long getId() {
		
		return this.id;
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
	
}
