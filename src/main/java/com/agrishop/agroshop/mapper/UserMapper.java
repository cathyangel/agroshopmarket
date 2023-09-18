package com.agrishop.agroshop.mapper;

import com.agrishop.agroshop.dto.UserDto;
import com.agrishop.agroshop.model.User;

public class UserMapper {

	public static UserDto toDto(User user) {
		
		UserDto dto=new UserDto();
		dto.setId(user.getId());
		dto.setPassword(user.getPassword());
		dto.setUserName(user.getUserName());
		dto.setEmail(user.getEmail());
		return dto;
		
	}
	
	
	public static User toEntity(UserDto dto) {
		
		User user=new User();
		user.setId(dto.getId());
		user.setPassword(dto.getPassword());
		user.setUserName(dto.getUserName());
		user.setEmail(dto.getEmail());
		return user;
	}
}
