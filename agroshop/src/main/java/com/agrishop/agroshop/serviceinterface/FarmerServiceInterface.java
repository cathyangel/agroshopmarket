package com.agrishop.agroshop.serviceinterface;

import java.util.List;

import com.agrishop.agroshop.dto.FarmerDto;

public interface FarmerServiceInterface {
	
	FarmerDto getFarmerById(long id);
	List<FarmerDto>getAllFarmer();
	FarmerDto createFarmer(FarmerDto farmerDto);
	FarmerDto updateFarmer(long id, FarmerDto farmerDto);
	void deleteFarmer(long id);
	
	

}
