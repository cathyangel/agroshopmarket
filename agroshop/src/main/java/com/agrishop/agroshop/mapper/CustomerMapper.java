package com.agrishop.agroshop.mapper;

import com.agrishop.agroshop.dto.CustomerDto;
import com.agrishop.agroshop.model.Customer;

public class CustomerMapper {

	public static CustomerDto toDto(Customer customer) {
		
		CustomerDto customerDto=new CustomerDto();
		
		customerDto.setId(customer.getId());
		customerDto.setNameCustomer(customer.getNameCustomer());
		
		
		return customerDto;
	}
	
	
	public static Customer toEntity(CustomerDto customerDto) {
		
		Customer customer=new Customer();
		
		customer.setId(customerDto.getId());
		customer.setNameCustomer(customerDto.getNameCustomer());
		return customer;
	}
}
