package com.agrishop.agroshop.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrishop.agroshop.dto.ProductDto;
import com.agrishop.agroshop.mapper.ProductMapper;
import com.agrishop.agroshop.model.Product;
import com.agrishop.agroshop.repository.ProductRepository;
import com.agrishop.agroshop.serviceinterface.ProductServiceInterface;

@Service
public class ProductService implements ProductServiceInterface {
    
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public ProductDto getProductById(Long id) {
		
		Product product=productRepository.findById(id).orElse(null);

			return ProductMapper.toDto(product);
	}
	
	@Override
	public List<ProductDto> getAllProducts(){
		
		List<Product> Products=productRepository.findAll();
		return Products.stream().map(ProductMapper::toDto).collect(Collectors.toList());
	
	}
	
	
	@Override
	public ProductDto createProduct(ProductDto productDto) {
		
		Product product=ProductMapper.toEntity(productDto);
		
		
		System.out.println("produit entity :" + product.getNameProduct());
		//product=Product.builder().nameProduct(productDto.getNameProduct()).price(productDto.getPrice()).description(productDto.getDescription()).image(productDto.getImage()).build();
				
		
		product=productRepository.save(product);
		
		return ProductMapper.toDto(product);
	}
	
	@Override
	public ProductDto updateProduct(Long id, ProductDto productDto) {
		
		Product product=productRepository.findById(id).orElse(null);
		if (product!=null) {
			product.setDescription(productDto.getDescription());
			product.setNameProduct(productDto.getNameProduct());
		
			product=productRepository.save(product);
			
		
		}else {
			System.out.println("le produit que vous voulez mettre a jour n'existe pas");
			return productDto;
		}
		return  ProductMapper.toDto(product);
	}
	
	
	@Override
	public void deleteProduct(long id) {
		
		Product product=productRepository.findById(id).orElse(null);
		
		if(product!=null) {
		productRepository.deleteById(id);
		
		}else {
			System.out.println("veillez entrer les identifiants d'un produit qui existe");
		}
	}
	
	
	
	
	
	
	
}
