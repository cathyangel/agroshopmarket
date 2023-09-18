package com.agrishop.agroshop.mapper;

import com.agrishop.agroshop.dto.ProductDto;
import com.agrishop.agroshop.model.Product;

public class ProductMapper {
   
	public static ProductDto toDto(Product product) {
		
		ProductDto dto= new ProductDto();
		dto.setId(product.getId());
		dto.setNameProduct(product.getNameProduct());
		dto.setDescription(product.getDescription());
		dto.setImage(product.getImage());
		dto.setPrice(product.getPrice());
		
		
		
		return dto;
	}
	
	public static Product toEntity(ProductDto productDto) {
		
		Product product=new Product();
		product.setNameProduct(productDto.getNameProduct());
		product.setDescription(productDto.getDescription());
		product.setImage(productDto.getImage());
		product.setPrice(productDto.getPrice());
		
		
		return product;
	}
}
