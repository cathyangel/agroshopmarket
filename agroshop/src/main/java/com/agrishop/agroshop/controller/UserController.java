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

import com.agrishop.agroshop.dto.UserDto;
import com.agrishop.agroshop.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/{id}")
	public ResponseEntity<UserDto>getUserById(@PathVariable long id){
		
		UserDto userdto=userService.getUserById(id);
		
		return ResponseEntity.ok(userdto);
	}
	
	@GetMapping
	public ResponseEntity<List<UserDto>>getallUsers(){
		List<UserDto> users=userService.getAllUsers();
		 return ResponseEntity.ok(users);
	}
	
	@PostMapping
	public ResponseEntity<UserDto>createUser(@RequestBody UserDto userDto){
		
		UserDto user=userService.createUser(userDto);
		
		return ResponseEntity.ok(user);
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<UserDto>updateUser(@PathVariable long id,@RequestBody UserDto userDto){
		UserDto user=userService.updateUser(id, userDto);
		return ResponseEntity.ok(user);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String>deleteUser(@PathVariable long id){
		
		String userMessage=userService.deleteUser(id);
		
		return ResponseEntity.ok(userMessage);
	}
	
	
	
	
	
	
	
}
