package com.agrishop.agroshop.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.agrishop.agroshop.dto.UserDto;
import com.agrishop.agroshop.mapper.UserMapper;
import com.agrishop.agroshop.model.User;
import com.agrishop.agroshop.repository.UserRepository;
import com.agrishop.agroshop.serviceinterface.UserServiceInterface;

@Service
public class UserService implements UserServiceInterface{

	@Autowired
	private PasswordEncoder encoder;

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDto getUserById(long id) {
		
		User user=userRepository.findById(id).orElse(null);
		return UserMapper.toDto(user);
		
	}
	
	@Override
	public List<UserDto>getAllUsers(){
		
		List<User> Users=userRepository.findAll();
		return Users.stream().map(UserMapper::toDto).collect(Collectors.toList());
	
	}
	
	
	@Override
	public UserDto createUser(UserDto userDto) {
		userDto.setPassword(encoder.encode(userDto.getPassword()));
		User user=UserMapper.toEntity(userDto);
		user=userRepository.save(user);
		return UserMapper.toDto(user);
	}
	
	@Override
	public UserDto updateUser(long id, UserDto userDto) {
		
		User user=userRepository.findById(id).orElse(null);
	    User userConvert=UserMapper.toEntity(userDto);
		user.setId(id);
		user.setPassword(userConvert.getPassword());
		user.setUserName(userConvert.getUserName());
		user.setEmail(userConvert.getEmail());
		user=userRepository.save(user);
		
		return UserMapper.toDto(user);
	}
	
	@Override 
	public String deleteUser(long id) {
		userRepository.deleteById(id);
		
		return"compte suprimer";
	}
	
	
	
}
