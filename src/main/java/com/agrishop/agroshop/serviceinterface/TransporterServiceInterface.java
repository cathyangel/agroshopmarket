package com.agrishop.agroshop.serviceinterface;

import java.util.List;

import com.agrishop.agroshop.dto.TransporterDto;

public interface TransporterServiceInterface {
   
	TransporterDto getTransporterById(long id);
	List<TransporterDto>getAllTransporters();
	TransporterDto createTransporter(TransporterDto transporterDto);
	TransporterDto updateTransporter(long id, TransporterDto transporterDto);
	String deleteTransporter(long id);
}
