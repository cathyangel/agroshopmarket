package com.agrishop.agroshop.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrishop.agroshop.dto.TransporterDto;
import com.agrishop.agroshop.mapper.TransporterMapper;
import com.agrishop.agroshop.model.Transporter;
import com.agrishop.agroshop.repository.TransporterRepository;
import com.agrishop.agroshop.serviceinterface.TransporterServiceInterface;

@Service
public class TransporterService implements TransporterServiceInterface {

	@Autowired
	private TransporterRepository transporterRepository;
	
	@Override
	public  TransporterDto getTransporterById(long id) {
		
		Transporter  transporter=transporterRepository.findById(id).orElse(null);
		return TransporterMapper.toDto(transporter);
	}
	
	@Override
	public List<TransporterDto> getAllTransporters(){
		
		List<Transporter> Transporters=transporterRepository.findAll();
		return Transporters.stream().map(TransporterMapper::toDto).collect(Collectors.toList());
	
	}
	
	@Override
	public TransporterDto createTransporter(TransporterDto transporterDto) {
		Transporter transporter=TransporterMapper.toEntity(transporterDto);
		transporter=transporterRepository.save(transporter);
		
		return TransporterMapper.toDto(transporter);
	}
	
	public TransporterDto updateTransporter(long id, TransporterDto transporterDto) {
		
		Transporter transporter=transporterRepository.findById(id).orElse(null);
		transporter.setNameTransporter(transporterDto.getNameTransporter());
		transporter=transporterRepository.save(transporter);
		
		return TransporterMapper.toDto(transporter);
	}
	
	
	public String deleteTransporter(long id) {
		transporterRepository.deleteById(id);
		
		return "livreur  suprimer";
	}
	
	
	
}
