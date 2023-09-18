package com.agrishop.agroshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agrishop.agroshop.dto.CommandDto;
import com.agrishop.agroshop.service.CommandService;

@RestController
@RequestMapping("/command")
public class CommandController {
	
	@Autowired
	private CommandService commandService;
	
	@GetMapping("/{id}")
	public ResponseEntity<CommandDto>getDto(@PathVariable long id){
		
		CommandDto commandDto=commandService.getcommandById(id);
		return ResponseEntity.ok(commandDto);
		
	}
	
	@GetMapping
	public ResponseEntity <List<CommandDto>>getAllCommands(){
		List<CommandDto> commandsDto= commandService.getAllCommand();
		
		return ResponseEntity.ok(commandsDto);
	}
	
	
	@PostMapping
	public ResponseEntity <CommandDto>createCommand(@RequestBody CommandDto commandDto){
		
		CommandDto createCommandDto=commandService.createCommand(commandDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(createCommandDto);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<CommandDto>updateCommand(@PathVariable long id, @RequestBody CommandDto commandDto){
		
		CommandDto updatecommandDto=commandService.updateCommand(id, commandDto);
		return ResponseEntity.ok(updatecommandDto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void>deteteCommand(@PathVariable long id){
		commandService.deleteCommand(id);
		return ResponseEntity.noContent().build();
	}
	
	
	
	

}
