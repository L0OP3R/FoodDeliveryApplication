package com.example.user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.user.dto.UserDTO;
import com.example.user.entity.User;

@Mapper
public interface UserMapper {
	
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
			
	User userDtoTOUser(UserDTO userDTO);
	UserDTO userToUserDTO(User user);

}