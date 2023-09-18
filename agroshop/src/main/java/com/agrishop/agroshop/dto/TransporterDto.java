package com.agrishop.agroshop.dto;


import lombok.Data;


@Data
public class TransporterDto {
	private long id;
	private String nameTransporter;
	
	
	public void setNameTransporter(String name2) {
		this.nameTransporter=name2;
		
	}

	public String getNameTransporter() {
		return this.nameTransporter;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
}
