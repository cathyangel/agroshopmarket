package com.agrishop.agroshop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.agrishop.agroshop.model.AuthRequest;
import com.agrishop.agroshop.model.User;
import com.agrishop.agroshop.repository.UserRepository;

@Service
public class loginService {

	@Autowired
	 private UserRepository userRepository;
	
	@Autowired
	private JwtService jwtService;
	
	 private PasswordEncoder passwordEncoder;
	
  public String Authenticate (AuthRequest authRequest) {
	  
	   Optional<User> optUser= userRepository.findByUserNameOrEmail(authRequest.getUsername(), authRequest.getUsername());
	      if(optUser!=null ) {
	    	  User user=optUser.get();
	    	   String  password= passwordEncoder.encode(authRequest.getPassword());
	    	      if (password==authRequest.getPassword()) {
	    	    	  
	    	    	  return jwtService.generationToken(user.getUserName());
	    	      }
	      }
		return null;
	    
  }
}
