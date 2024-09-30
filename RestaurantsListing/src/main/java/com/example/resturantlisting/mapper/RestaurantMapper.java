package com.example.resturantlisting.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.resturantlisting.dto.RestaurantDTO;
import com.example.resturantlisting.entity.Restaurant;

@Mapper
public interface RestaurantMapper {

	RestaurantMapper Instance = Mappers.getMapper(RestaurantMapper.class);
	
    Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);
	
	RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);
}
