package com.example.user.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.dto.UserDTO;
import com.example.user.entity.User;
import com.example.user.mapper.UserMapper;
import com.example.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/saveUser")
	public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userdto){
		UserDTO savedUser = userService.addUser(userdto);
		return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	}
	
	@GetMapping("/fetchUserDetailsById/{id}")
	public ResponseEntity<UserDTO> fetchUserById(@PathVariable Integer id){
		Optional<User> userDetails =  userService.fetchUserDetailsById(id);
		if(userDetails.isPresent()) {
			return new ResponseEntity<>(UserMapper.INSTANCE.userToUserDTO(userDetails.get()), HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
	
}
