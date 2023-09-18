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

import com.agrishop.agroshop.dto.PersonDto;
import com.agrishop.agroshop.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService personservice;
	
	@GetMapping("/{id}")
	public ResponseEntity<PersonDto>getPersonnById(@PathVariable long id){
		
		PersonDto persondto=personservice.getPersonById(id);
		return ResponseEntity.ok(persondto);
	}
	
	@GetMapping
	public ResponseEntity<List<PersonDto>>getAllPersons(){
		
		List<PersonDto> persall=personservice.getAllPerson();
		
		return ResponseEntity.ok(persall);
	}
	
	@PostMapping
	public ResponseEntity<PersonDto>createPerson(@RequestBody PersonDto personDto){
		
		PersonDto persdto=personservice.createPerson(personDto);
		return ResponseEntity.ok(persdto);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<PersonDto>updatePerson(@PathVariable long id, @RequestBody PersonDto persondto){
		
		PersonDto persdto=personservice.updatePerson(id, persondto);
		return ResponseEntity.ok(persdto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String>deletePerson(@PathVariable long id){
		
		String message=personservice.deletePerson(id);
		return ResponseEntity.ok(message);
	}
	
}

