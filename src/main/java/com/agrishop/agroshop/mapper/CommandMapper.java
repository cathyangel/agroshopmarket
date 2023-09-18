package com.agrishop.agroshop.mapper;

import com.agrishop.agroshop.dto.CommandDto;
import com.agrishop.agroshop.model.Command;

public class CommandMapper {
	
	public static CommandDto toDto(Command command) {
		CommandDto dto= new CommandDto();
		dto.setId(command.getId());
		dto.setNameCommand(command.getNameCommand());
		dto.setPaiementMethod(command.getPaiementMethod());
		dto.setDescription(command.getDescription());
		dto.setTotalMontant(command.getTotalMontant());
		dto.setTva(command.getTva());
		
		return dto;
		
	}
	
	
	public static Command toEntity(CommandDto commandDto) {
		
		Command command= new Command();
		command.setId(commandDto.getId());
		command.setDescription(commandDto.getDescription());
		command.setNameCommand(commandDto.getNameCommand());
		command.setPaiementMethod(commandDto.getPaiementMethod());
		command.setTotalMontant(commandDto.getTotalMontant());
		command.setTva(commandDto.getTva());
		return command;
		
	}

}
