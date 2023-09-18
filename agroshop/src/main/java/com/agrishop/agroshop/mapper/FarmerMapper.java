package com.agrishop.agroshop.mapper;

import com.agrishop.agroshop.dto.FarmerDto;
import com.agrishop.agroshop.model.Farmer;

public class FarmerMapper {

	
	public static FarmerDto toDto(Farmer farmer) {
		
		FarmerDto farmerDto=new FarmerDto();
		farmerDto.setId(farmer.getId());
		farmerDto.setLicence(farmer.getLicence());
		farmerDto.setLocalisation(farmer.getLocalisation());
		farmerDto.setNationalCard(farmer.getNationalCard());;
		farmerDto.setPhoto(farmer.getPhoto());
		farmerDto.setId(farmer.getId());
		farmerDto.setCommand(farmer.getCommands());
		farmerDto.setCustome(farmer.getCustomer());
		farmerDto.setProduct(farmer.getProducts());
		
		return farmerDto;
		
	}
	
	public static  Farmer toEntity(FarmerDto farmerDto) {
		
		Farmer farmer=new Farmer();
		farmer.setId(farmer.getId());
		farmer.setLicence(farmerDto.getLicence());
		farmer.setLocalisation(farmerDto.getLocalisation());
		farmer.setNationalCard(farmerDto.getNationalCard());
		farmer.setPhoto(farmerDto.getPhoto());
		farmer.setCommands(farmerDto.getCommand());
		farmer.setCustomer(farmerDto.getCustome());
		farmer.setProducts(farmerDto.getProduct());
		
		return farmer;
	}
	
}
