package com.agrishop.agroshop.serviceinterface;

import java.util.List;

import com.agrishop.agroshop.dto.BasketDto;

public interface BasketServiceInterface {
	
	BasketDto getBasketById(Long id);
	List<BasketDto>getAllBaskets();
	BasketDto createBasket(BasketDto basketDto);
	BasketDto updateBasket(Long id, BasketDto basketDto);
	void deleteBasket(Long id);
	

}
