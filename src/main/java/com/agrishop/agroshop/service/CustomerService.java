package com.agrishop.agroshop.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrishop.agroshop.dto.CustomerDto;
import com.agrishop.agroshop.mapper.CustomerMapper;
import com.agrishop.agroshop.model.Customer;
import com.agrishop.agroshop.repository.CustomerRepository;
import com.agrishop.agroshop.serviceinterface.CustomerServiceInterface;

@Service
public class CustomerService implements CustomerServiceInterface {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public CustomerDto getCustomerById(long id) {
		
		Customer customer=customerRepository.findById(id).orElse(null);
		
		return CustomerMapper.toDto(customer);
	}
	
	@Override
	public List<CustomerDto> getAllCustomers(){
		
		List<Customer> customerList=customerRepository.findAll();
		return customerList.stream().map(CustomerMapper::toDto).collect(Collectors.toList());
	}
	
	@Override
	public CustomerDto createCustomer(CustomerDto customerDto) {
		
		Customer customer=CustomerMapper.toEntity(customerDto);
		 customer=customerRepository.save(customer);
		
		return CustomerMapper.toDto(customer);
	}
	
	@Override
	public CustomerDto updateCustomer(long id , CustomerDto customerDto) {
		
		Customer customer=customerRepository.findById(id).orElse(null);
		Customer custom=CustomerMapper.toEntity(customerDto);
		customer.setId(customerDto.getId());
		customer.setNameCustomer(custom.getNameCustomer());
		
		customer=customerRepository.save(customer);
		return CustomerMapper.toDto(custom);
	}
	
	@Override
	public String deleteCustomer(long id) {
		customerRepository.deleteById(id);
		
		return "Client suprimer avec succè";
	}
	
}
