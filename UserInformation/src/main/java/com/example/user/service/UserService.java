package com.example.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.user.dto.UserDTO;
import com.example.user.entity.User;
import com.example.user.mapper.UserMapper;
import com.example.user.repo.UserRepository;

@Service
public class UserService {
@Autowired
UserRepository userRepository;

	public UserDTO addUser(UserDTO userdto) {
		// TODO Auto-generated method stub
		User savedUser =  userRepository.save(UserMapper.INSTANCE.userDtoTOUser(userdto));
		
		return UserMapper.INSTANCE.userToUserDTO(savedUser);
	}

	public Optional<User> fetchUserDetailsById(Integer id) {
		// TODO Auto-generated method stub
		Optional<User> findUser = userRepository.findById(id);
		return findUser;
	}

}
