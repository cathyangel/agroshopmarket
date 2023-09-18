package com.agrishop.agroshop.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrishop.agroshop.dto.BasketDto;
import com.agrishop.agroshop.mapper.BasketMapper;
import com.agrishop.agroshop.model.Basket;
import com.agrishop.agroshop.repository.BasketRepository;
import com.agrishop.agroshop.serviceinterface.BasketServiceInterface;

@Service
public class BasketService implements BasketServiceInterface {
	
	@Autowired
	private BasketRepository basketRepository;
	
	@Override
	public BasketDto getBasketById(Long id) {
		
		Basket basket=basketRepository.findById(id).orElse(null);
		
		return BasketMapper.toDTO(basket);
	}
	
	@Override
	public List<BasketDto> getAllBaskets(){
		
		List<Basket> Baskets=basketRepository.findAll();
		return Baskets.stream().map(BasketMapper::toDTO).collect(Collectors.toList());
	}
	
	@Override
	public BasketDto createBasket(BasketDto basketDto) {
		
		Basket basket=BasketMapper.toEntity(basketDto); //ici on convertit le DTO en entité pour pouvoir le stocker dans la ase de donné
		basket= basketRepository.save(basket);
		
		return BasketMapper.toDTO(basket);  //ici on le convertit en DTO pour que l'utilisateur puisse le voir car il ne voit que des objets de type dto
	}
	
	@Override
	public BasketDto updateBasket(Long id, BasketDto basketDto) {
		
		//recupere l'entité basket a partir du repository en utilisant l'id
		Basket basket=basketRepository.findById(id).orElse(null);
		basket.setQuantity(basketDto.getQuantity());
		basket.setDescription(basketDto.getDescription());
		basket.setPriceUnit(basketDto.getPriceUnit());
		basket.setTotalPrice(basketDto.getTotalPrice());
		basket=basketRepository.save(basket);
		
		return BasketMapper.toDTO(basket);
		
	}
	
	@Override
	public void deleteBasket(Long id) {
		basketRepository.deleteById(id);
	}
	
    
	
}
