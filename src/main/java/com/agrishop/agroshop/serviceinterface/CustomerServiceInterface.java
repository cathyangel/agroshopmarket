package com.agrishop.agroshop.serviceinterface;

import java.util.List;

import com.agrishop.agroshop.dto.CustomerDto;

public interface CustomerServiceInterface {

	CustomerDto getCustomerById(long id);
    List<CustomerDto> getAllCustomers();
    CustomerDto createCustomer(CustomerDto customerDto);
    CustomerDto updateCustomer(long id, CustomerDto customerdto);
    String deleteCustomer(long id);
}
