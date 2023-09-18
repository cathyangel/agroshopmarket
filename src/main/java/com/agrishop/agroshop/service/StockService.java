package com.agrishop.agroshop.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrishop.agroshop.dto.StockDto;
import com.agrishop.agroshop.mapper.StockMapper;
import com.agrishop.agroshop.model.Stock;
import com.agrishop.agroshop.repository.StockRepository;
import com.agrishop.agroshop.serviceinterface.StockServiceInterface;

@Service
public class StockService implements StockServiceInterface{
	
	@Autowired
	StockRepository stockRepository;
	
	@Override
	public StockDto getStockById(long id) {
		
		Stock stock=stockRepository.findById(id).orElse(null);
		
		return StockMapper.toDto(stock);
		
	}
	
	@Override 
	public List<StockDto>getAllStock(){
		
		List<Stock> stocks=stockRepository.findAll();
		return stocks.stream().map(StockMapper::toDto).collect(Collectors.toList());
	
	}
	
	@Override
	public StockDto createStock(StockDto stock) {
		
		Stock stocke=StockMapper.toEntity(stock);
		stockRepository.save(stocke);
		
		return StockMapper.toDto(stocke);
	}
	
	@Override
	public StockDto updateStock(long id, StockDto stockdto) {
		
		Stock stock=stockRepository.findById(id).orElse(null);
		Stock stockEnti=StockMapper.toEntity(stockdto);
		
		stock.setId(id);
		stock.setPrice(stockEnti.getPrice());
		stock.setQuantity(stockEnti.getQuantity());
		stock=stockRepository.save(stock);
		
		return StockMapper.toDto(stock);
		
	}
	
	@Override
	public void deleteStock(long id) {
		
		stockRepository.deleteById(id);
		 
	}
	
	

}
