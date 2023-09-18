package com.agrishop.agroshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transporter {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nameTransporter;
	
	
	@ManyToOne
	@JoinColumn(name="command_id",referencedColumnName = "id", nullable=false)
	private Command commands;
	

	public String getNameTransporter() {
		return nameTransporter;
	}

	public void setNameTransporter(String name) {
		this.nameTransporter = name;
	}

	public long getId() {
		
		return this.id;
	}

	public void setId(long id2) {
		 
		this.id=id2;
		
	}
	
}
