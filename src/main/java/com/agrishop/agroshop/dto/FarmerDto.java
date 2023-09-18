package com.agrishop.agroshop.dto;

import com.agrishop.agroshop.model.Command;
import com.agrishop.agroshop.model.Customer;
import com.agrishop.agroshop.model.Product;

import lombok.Data;


@Data
public class FarmerDto {
	
	private long id;
	private String licence;
	private String  nationalCard;
	private String localisation;
	private String photo;
	private Command command;
	private Product product;
	private Customer custome;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public void setNationalCard(String national_card) {
		nationalCard = national_card;
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
	public Command getCommand() {
		return command;
	}
	public void setCommand(Command command) {
		this.command = command;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Customer getCustome() {
		return custome;
	}
	public void setCustome(Customer custome) {
		this.custome = custome;
	}
	
	

}
