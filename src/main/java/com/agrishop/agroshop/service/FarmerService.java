package com.agrishop.agroshop.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrishop.agroshop.dto.FarmerDto;
import com.agrishop.agroshop.mapper.FarmerMapper;
import com.agrishop.agroshop.model.Farmer;
import com.agrishop.agroshop.repository.FarmerRepository;
import com.agrishop.agroshop.serviceinterface.FarmerServiceInterface;

@Service
public class FarmerService implements FarmerServiceInterface{
	@Autowired
	private FarmerRepository farmerRepository;
	
	@Override
	public FarmerDto getFarmerById(long id) {
		
		Farmer farmer=farmerRepository.findById(id).orElse(null);
		return FarmerMapper.toDto(farmer);
	}
	
	@Override
	public List<FarmerDto>getAllFarmer(){
			
			List<Farmer> farmers=farmerRepository.findAll();
			return farmers.stream().map(FarmerMapper::toDto).collect(Collectors.toList());
		
	}
	
	@Override
	public FarmerDto createFarmer(FarmerDto farmerDto) {
		
		Farmer farmer=FarmerMapper.toEntity(farmerDto);
		
	    farmer=farmerRepository.save(farmer);
	    
	    return FarmerMapper.toDto(farmer);
	}
	
	@Override
	public FarmerDto updateFarmer(long id, FarmerDto farmerDto) {
		
		Farmer farmer=farmerRepository.findById(id).orElse(null);
		Farmer farmerentity=FarmerMapper.toEntity(farmerDto);
		
		
		farmer.setLicence(farmerentity.getLicence());
		farmer.setLocalisation(farmerentity.getLocalisation());
		farmer.setNationalCard(farmerentity.getNationalCard());
		farmer.setPhoto(farmerentity.getPhoto());
		
		farmerRepository.save(farmer);
		
		return FarmerMapper.toDto(farmer);
		
	}
	
	@Override
	public void deleteFarmer(long id) {
		farmerRepository.deleteById(id);
	}
	
	
	
	
}
