package com.agrishop.agroshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agrishop.agroshop.dto.StockDto;
import com.agrishop.agroshop.service.StockService;

@RestController
@RequestMapping("/stock")
public class StockController {

	@Autowired 
	StockService stockservice;
	
	@GetMapping("/{id}")
	public ResponseEntity <StockDto> getStockById(@PathVariable long id) {
		
		StockDto stockdto=stockservice.getStockById(id);
		
		return ResponseEntity.ok(stockdto);
	}
	
	@GetMapping
	public ResponseEntity<List<StockDto>>getAllStock(){
		
		List<StockDto>stockdto=stockservice.getAllStock();
		
		return ResponseEntity.ok(stockdto);
		
	}
	
	@PostMapping
	public ResponseEntity<StockDto>createStock(@RequestBody StockDto stockDto){
		
		StockDto stockdto=stockservice.createStock(stockDto);
		return ResponseEntity.ok(stockdto);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<StockDto>updateStock(@PathVariable long id,@RequestBody StockDto stockdto){
		
		StockDto stockDto=stockservice.updateStock(id, stockdto);
		return ResponseEntity.ok(stockDto);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void>deleteBasket(@PathVariable long id){
		
		stockservice.deleteStock(id);
		return ResponseEntity.noContent().build();
	}
	
}
