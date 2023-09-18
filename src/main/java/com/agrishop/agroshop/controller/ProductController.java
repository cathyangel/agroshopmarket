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

import com.agrishop.agroshop.dto.ProductDto;
import com.agrishop.agroshop.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/{id}")
	public ResponseEntity<ProductDto>getProductById(@PathVariable long id){
		
		ProductDto productDto=productService.getProductById(id);
		return ResponseEntity.ok(productDto);
	}
	
	@GetMapping
	public ResponseEntity<List<ProductDto>>getAllProducts(){
		
		List<ProductDto> products=productService.getAllProducts();
		
		return ResponseEntity.ok(products);
	}
	
	@PostMapping
	public ResponseEntity<ProductDto>createProduct(@RequestBody ProductDto productDto){
		
		System.out.println("productDto : " + productDto.getNameProduct());
		
		ProductDto productdto=productService.createProduct(productDto);
		
		return ResponseEntity.ok(productdto);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ProductDto>updateProduct(@PathVariable long id ,@RequestBody ProductDto productDto){
		
		ProductDto products=productService.updateProduct(id, productDto);
		
		return ResponseEntity.ok(products);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void>deleteProduct(@PathVariable long id){
		productService.deleteProduct(id);
		return ResponseEntity.noContent().build();
	}
	
}
