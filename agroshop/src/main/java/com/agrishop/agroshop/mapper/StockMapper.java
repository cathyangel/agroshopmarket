package com.agrishop.agroshop.mapper;

import com.agrishop.agroshop.dto.StockDto;
import com.agrishop.agroshop.model.Stock;

public class StockMapper {

	public static StockDto toDto(Stock stock) {
		
		StockDto stockdto=new StockDto();
		stockdto.setId(stock.getId());
		stockdto.setPrice(stock.getPrice());
		stockdto.setQuantity(stock.getQuantity());
		
		return stockdto;
	}
	
	public static Stock toEntity(StockDto stockdto) {
		
		Stock stock=new Stock();
		stock.setId(stockdto.getId());
		stock.setPrice(stockdto.getPrice());
		stock.setQuantity(stock.getQuantity());
		
		return stock;
	}
}
