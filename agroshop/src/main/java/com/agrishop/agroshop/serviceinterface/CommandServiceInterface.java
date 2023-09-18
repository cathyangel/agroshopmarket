package com.agrishop.agroshop.serviceinterface;

import java.util.List;

import com.agrishop.agroshop.dto.CommandDto;

public interface CommandServiceInterface {
	
	CommandDto getcommandById(long id);
	List<CommandDto>getAllCommand();
	CommandDto createCommand(CommandDto commandDto);
	CommandDto updateCommand(long id, CommandDto commandDto);
	void deleteCommand(long id);

}
