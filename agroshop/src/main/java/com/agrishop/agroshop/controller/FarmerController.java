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

import com.agrishop.agroshop.dto.FarmerDto;
import com.agrishop.agroshop.service.FarmerService;

@RestController
@RequestMapping("/farmer")
public class FarmerController {

	@Autowired
	private FarmerService farmerService;
	
	@GetMapping("/{id}")
	public ResponseEntity <FarmerDto>getFarmer(@PathVariable long id){
		FarmerDto farmerdto=farmerService.getFarmerById(id);
		
		return ResponseEntity.ok(farmerdto);
	}
	
	@GetMapping
	public ResponseEntity<List<FarmerDto>>getAllFarmer(){
		List<FarmerDto> farmer=farmerService.getAllFarmer();
		
		return ResponseEntity.ok(farmer);
	}
	
	@PostMapping
	public ResponseEntity<FarmerDto>createFarmer(@RequestBody FarmerDto farmerDto){
		
		return ResponseEntity.ok(farmerService.createFarmer(farmerDto));
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<FarmerDto>updateFarmer(@PathVariable long id , @RequestBody FarmerDto farmerDto){
		
		return ResponseEntity.ok(farmerService.updateFarmer(id, farmerDto));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void>deleteFarmer(@PathVariable long id ){
		
		farmerService.deleteFarmer(id);
		return ResponseEntity.noContent().build();
	}
	
	
	
}
