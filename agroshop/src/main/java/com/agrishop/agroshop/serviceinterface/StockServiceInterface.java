package com.agrishop.agroshop.serviceinterface;

import java.util.List;

import com.agrishop.agroshop.dto.StockDto;

public interface StockServiceInterface {
	
	StockDto getStockById(long id);
    List< StockDto> getAllStock();
    StockDto createStock(StockDto stockdto);
    StockDto updateStock(long id, StockDto stockdto);
    void deleteStock(long id);
    
}
