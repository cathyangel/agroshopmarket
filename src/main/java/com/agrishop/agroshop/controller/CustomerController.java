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

import com.agrishop.agroshop.dto.CustomerDto;
import com.agrishop.agroshop.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/{id}")
	public ResponseEntity<CustomerDto>getCustomerByid(@PathVariable long id){
		
		CustomerDto customerDto=customerService.getCustomerById(id);
		
		return ResponseEntity.ok(customerDto);
	}
	
	@GetMapping
	public ResponseEntity<List<CustomerDto>>getAllCustomer(){
		
		List<CustomerDto> listCustomer=customerService.getAllCustomers();
		
		return ResponseEntity.ok(listCustomer);
	}
	
	@PostMapping
	public ResponseEntity<CustomerDto>createCustomer(@RequestBody CustomerDto customerDto){
		
		CustomerDto customer=customerService.createCustomer(customerDto);
		
		return ResponseEntity.ok(customer);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<CustomerDto>updateCustomer(@PathVariable long id, @RequestBody CustomerDto customerDto){
		
		CustomerDto customer=customerService.updateCustomer(id, customerDto);
		return ResponseEntity.ok(customer);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String>deleteBasket(@PathVariable long id){
	String messagecustomer=	customerService.deleteCustomer(id);
		return ResponseEntity.ok(messagecustomer);
	}
	
}
