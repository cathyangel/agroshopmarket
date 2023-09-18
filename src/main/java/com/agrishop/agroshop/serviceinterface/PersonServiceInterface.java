package com.agrishop.agroshop.serviceinterface;

import java.util.List;

import com.agrishop.agroshop.dto.PersonDto;

public interface PersonServiceInterface {
	
	PersonDto getPersonById(long id);
	List<PersonDto>getAllPerson();
	PersonDto createPerson(PersonDto persondto);
	PersonDto updatePerson(long id, PersonDto personDto);
	String deletePerson(long id);

}
