package com.agrishop.agroshop.serviceinterface;

import java.util.List;

import com.agrishop.agroshop.dto.ProductDto;

public interface ProductServiceInterface {
 
	ProductDto getProductById(Long id);
	List<ProductDto>getAllProducts();
	ProductDto createProduct(ProductDto productDto);
	ProductDto updateProduct(Long id,ProductDto productDto);
	void deleteProduct(long id);
}
