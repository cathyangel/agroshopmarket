package com.agrishop.agroshop.mapper;

import com.agrishop.agroshop.dto.BasketDto;
import com.agrishop.agroshop.model.Basket;

public class BasketMapper {
	
	public static BasketDto toDTO(Basket basket) {
	
		BasketDto dto=new BasketDto();
		dto.setId(basket.getId());
		dto.setQuantity(basket.getQuantity());
		dto.setDescription(basket.getDescription());
		dto.setPriceUnit(basket.getPriceUnit());
		dto.setTotalPrice(basket.getTotalPrice());
		
		return dto;
	}
	 
   public static Basket toEntity(BasketDto dto) {
	   Basket basket=new Basket();
	   basket.setId(dto.getId());
	   basket.setQuantity(dto.getQuantity());
	   basket.setDescription(dto.getDescription());
	   basket.setPriceUnit(dto.getPriceUnit());
	   basket.setTotalPrice(dto.getTotalPrice());
	   
	   return basket;
   }
}
