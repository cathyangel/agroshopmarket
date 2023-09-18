package com.agrishop.agroshop.model;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

  
public class ProductCommand{
	@Id
  Long id;
	private Date date;

    @ManyToOne
    @JoinColumn(name="product_id", nullable=false)
    Product product;
    
    
    @ManyToOne
    @JoinColumn(name="command_id",nullable=false)
    Command command ;
    
LocalDateTime registeredAt;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}

public Command getCommand() {
	return command;
}

public void setCommand(Command command) {
	this.command = command;
}

public LocalDateTime getRegisteredAt() {
	return registeredAt;
}

public void setRegisteredAt(LocalDateTime registeredAt) {
	this.registeredAt = registeredAt;
}

}
