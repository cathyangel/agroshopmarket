package com.agrishop.agroshop.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrishop.agroshop.dto.CommandDto;
import com.agrishop.agroshop.mapper.CommandMapper;
import com.agrishop.agroshop.model.Command;
import com.agrishop.agroshop.repository.CommandRepository;
import com.agrishop.agroshop.serviceinterface.CommandServiceInterface;

@Service
public class CommandService implements CommandServiceInterface{

	@Autowired
	private CommandRepository commandRepository;
	
	@Override
	public CommandDto getcommandById (long id){
		
		Command command=commandRepository.findById(id).orElse(null);
		return CommandMapper.toDto(command);
	}
	
	@Override
	public List<CommandDto> getAllCommand(){
		
		List<Command> Commands=commandRepository.findAll();
		
		return Commands.stream().map(CommandMapper::toDto).collect(Collectors.toList());
	}
	
	@Override
	public CommandDto createCommand(CommandDto commandDto) {
		
		Command command=CommandMapper.toEntity(commandDto);
		command=commandRepository.save(command);
		
		return CommandMapper.toDto(command);
	}
		
		@Override
		public CommandDto updateCommand(long id,CommandDto commandDto) {
			Command command=commandRepository.findById(id).orElse(null);
			command.setDescription(commandDto.getDescription());
			command.setNameCommand(commandDto.getNameCommand());
			command.setPaiementMethod(commandDto.getPaiementMethod());
			command.setTotalMontant(commandDto.getTotalMontant());
			command.setTva(commandDto.getTva());
			
			command=commandRepository.save(command);
			return CommandMapper.toDto(command);				
	}
	
	
	@Override
	
		public void deleteCommand(long id) {
			
			commandRepository.deleteById(id);
		}
	}
	
	
	
	
	
	
	
	
