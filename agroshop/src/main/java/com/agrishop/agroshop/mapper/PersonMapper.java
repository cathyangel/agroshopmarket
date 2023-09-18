package com.agrishop.agroshop.mapper;

import com.agrishop.agroshop.dto.PersonDto;
import com.agrishop.agroshop.model.Person;

public class PersonMapper {

	
	public static PersonDto toDto(Person person) {
		
		PersonDto persdto=new PersonDto();
		persdto.setId(person.getId());
		persdto.setFirstName(person.getFirstName());
		persdto.setLastName(person.getLastName());
		persdto.setBirthday(person.getBirthday());
		persdto.setAdress(person.getAdress());
		persdto.setPhoneNumber(person.getPhoneNumber());
		persdto.setSexe(person.getSexe());
		
		return persdto;
	}
	
	public static Person toEntity(PersonDto persdto) {
		
		Person person=new Person();
		person.setId(persdto.getId());
		person.setAdress(persdto.getAdress());
		person.setBirthday(persdto.getBirthday());
		person.setFirstName(persdto.getFirstName());
		person.setLastName(persdto.getLastName());
		person.setPhoneNumber(persdto.getPhoneNumber());
		person.setSexe(persdto.getSexe());
		
		
		return person;
	}
}
