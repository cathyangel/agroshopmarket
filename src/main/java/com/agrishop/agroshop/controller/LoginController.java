package com.agrishop.agroshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agrishop.agroshop.dto.UserDto;
import com.agrishop.agroshop.model.AuthRequest;
import com.agrishop.agroshop.service.UserService;
import com.agrishop.agroshop.service.loginService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/auth")
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private loginService servicelog;


	
	
	
	@PostMapping("/register")
	public UserDto addNewUser(@RequestBody UserDto userDto) {
		
		return userService.createUser(userDto);
	}
	
	@PostMapping("/login")
	public  String authentificateAndGetToken(@RequestBody AuthRequest authRequest) {
		
		return servicelog.Authenticate(authRequest);
	
	}
	
	
}
