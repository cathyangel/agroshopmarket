package com.agrishop.agroshop.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrishop.agroshop.dto.PersonDto;
import com.agrishop.agroshop.mapper.PersonMapper;
import com.agrishop.agroshop.model.Person;
import com.agrishop.agroshop.repository.PersonRepository;
import com.agrishop.agroshop.serviceinterface.PersonServiceInterface;

@Service
public class PersonService implements PersonServiceInterface{

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public PersonDto getPersonById(long id) {
		
		Person person=personRepository.findById(id).orElse(null);
		return PersonMapper.toDto(person);
	}
	
	@Override
	public List<PersonDto> getAllPerson(){
		
		List<Person> person=personRepository.findAll();
		return person.stream().map(PersonMapper::toDto).collect(Collectors.toList());
	}
	
	@Override
	public PersonDto updatePerson(long id, PersonDto persondto) {
		
		Person person=personRepository.findById(id).orElse(null);
		Person perso=PersonMapper.toEntity(persondto);
	    
		person.setId(perso.getId());
		person.setAdress(perso.getAdress());
		person.setBirthday(perso.getBirthday());
		person.setFirstName(perso.getFirstName());
		person.setLastName(perso.getLastName());
		person.setPhoneNumber(perso.getPhoneNumber());
		person.setSexe(perso.getSexe());
		
		personRepository.save(person);
		return PersonMapper.toDto(person);
		
	}
	
	
	@Override
	public PersonDto createPerson(PersonDto persondto) {
		
		Person person=PersonMapper.toEntity(persondto);
		personRepository.save(person);
		
		return PersonMapper.toDto(person);
	}
	
	
	@Override
	public String deletePerson(long id) {
		
		personRepository.deleteById(id);
		
		return "Person suprimer avec succès";
	}
	
}
