package com.agrishop.agroshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agrishop.agroshop.dto.BasketDto;
import com.agrishop.agroshop.service.BasketService;

@RestController
@RequestMapping("/basket")
public class BasketController {

	@Autowired
	private BasketService basketService;
	
	@GetMapping("/{id}")
	public ResponseEntity<BasketDto>getBasket(@PathVariable long id){
		
		BasketDto basketDto=basketService.getBasketById(id);
		return ResponseEntity.ok(basketDto);
	}
	
	@GetMapping
	public ResponseEntity<List<BasketDto>> getAllBaskets(){
		
		List<BasketDto> basketsdto=basketService.getAllBaskets();
		return ResponseEntity.ok(basketsdto);
	}
	
	@PostMapping
	public ResponseEntity<BasketDto>createBasket(@RequestBody BasketDto basketdto){
		BasketDto createdBasketDto=basketService.createBasket(basketdto);
		 
		return ResponseEntity.status(HttpStatus.CREATED).body(createdBasketDto);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<BasketDto>updateBasket(@PathVariable long id, @RequestBody BasketDto basketDto){
		BasketDto updateBasketDto=basketService.updateBasket(id, basketDto);
		return ResponseEntity.ok(updateBasketDto);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void>deleteBasket(@PathVariable long id){
		basketService.deleteBasket(id);
		return ResponseEntity.noContent().build();
	}
	
}
