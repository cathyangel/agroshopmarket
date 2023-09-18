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

import com.agrishop.agroshop.dto.TransporterDto;
import com.agrishop.agroshop.service.TransporterService;

@RestController
@RequestMapping("/transporter")
public class TransporterController {
    
	@Autowired
	private TransporterService transporterService;
	
	@GetMapping("/{id}")
	public ResponseEntity <TransporterDto>getTransporterDto(@PathVariable long id) {
		
		 TransporterDto transporterDto=transporterService.getTransporterById(id);
		 return ResponseEntity.ok(transporterDto);
	}
	
	@GetMapping
	public ResponseEntity<List<TransporterDto>>getAllTransporters(@RequestBody TransporterDto transporterDto){
		
		List<TransporterDto> transporterDtos=transporterService.getAllTransporters();
		
		return ResponseEntity.ok(transporterDtos);
	}
	
	@PostMapping
	public ResponseEntity<TransporterDto>createTransporter(@RequestBody TransporterDto transporterDto){
		
		TransporterDto transporterDtos=transporterService.createTransporter(transporterDto);
		
		return ResponseEntity.ok(transporterDtos);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<TransporterDto>updateTransporter(@PathVariable long id, @RequestBody TransporterDto transporterDto){
		
		TransporterDto transporterDtos=transporterService.updateTransporter(id, transporterDto);
		
		return ResponseEntity.ok(transporterDtos);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String>deleteTransporter(@PathVariable long id){
		
		String transporter=transporterService.deleteTransporter(id);
		
		return ResponseEntity.ok(transporter);
	}
	
	
	
	
	
	
}
