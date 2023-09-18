package com.agrishop.agroshop.dto;


import lombok.Data;

@Data
public class ProductDto {
    private long id;
	private String nameProduct;
	private String description;
	private String image;
	private double price;
	
	
	public ProductDto() {}
	public ProductDto(Long id, String nameProduct ,String description, String image2,double price) {
		this.id = id;
		this.nameProduct=nameProduct;
		this.description=description;
		this.image=image2;
		this.price=price;
	}
	
	
	
	public void setId(long id2) {
		
		this.id=id2;
		
	}

	public String getDescription() {
		return description;
	}


	public void setDescription(String description1) {
		this.description = description1;
	}
	public long getId() {

		return this.id;
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
