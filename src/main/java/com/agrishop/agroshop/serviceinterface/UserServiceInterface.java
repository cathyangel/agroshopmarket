package com.agrishop.agroshop.serviceinterface;

import java.util.List;

import com.agrishop.agroshop.dto.UserDto;

public interface UserServiceInterface {
	
	UserDto getUserById(long id);
	List<UserDto>getAllUsers();
	UserDto createUser(UserDto userDto);
	UserDto updateUser(long id, UserDto userDto);
	String deleteUser(long id);

}
