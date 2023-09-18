package com.agrishop.agroshop.mapper;

import com.agrishop.agroshop.dto.TransporterDto;
import com.agrishop.agroshop.model.Transporter;

public class TransporterMapper {
	
	public static TransporterDto toDto(Transporter transporter) {
		
		TransporterDto dto= new TransporterDto();
		
		dto.setId(transporter.getId());
		dto.setNameTransporter(transporter.getNameTransporter());
		
		return dto;
	}
	
	public static Transporter toEntity(TransporterDto dto) {
		
		Transporter transporter=new Transporter();
		
		transporter.setId(dto.getId());
		transporter.setNameTransporter(dto.getNameTransporter());
		
		return transporter;
	}

}
