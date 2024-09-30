package com.example.resturantlisting.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.resturantlisting.dto.RestaurantDTO;
import com.example.resturantlisting.entity.Restaurant;
import com.example.resturantlisting.mapper.RestaurantMapper;
import com.example.resturantlisting.repository.RestaurantRepository;

@Service
public class RestaurantService {
@Autowired
RestaurantRepository restaurantRepository;
	public RestaurantDTO addRestaurant(RestaurantDTO restaurantDTO) {
		// TODO Auto-generated method stub
		Restaurant savedRestaurant = restaurantRepository.save(RestaurantMapper.Instance.mapRestaurantDTOToRestaurant(restaurantDTO));
		return RestaurantMapper.Instance.mapRestaurantToRestaurantDTO(savedRestaurant);
	}
	public List<RestaurantDTO> fetchAllRestaurants() {
		// TODO Auto-generated method stub
		//To perform any action on a collection we have to open a "stream" API java 8 method to do any action.
		List<Restaurant> restaurants =  restaurantRepository.findAll();
		List<RestaurantDTO> restaurantDTOs =  restaurants.stream().map(t -> RestaurantMapper.Instance.mapRestaurantToRestaurantDTO(t) ).collect(Collectors.toList());
		
		return restaurantDTOs;
	}
	public ResponseEntity<RestaurantDTO> fetchRestaurantById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Restaurant> fetchRestaurantById = restaurantRepository.findById(id);
		if(fetchRestaurantById.isPresent()){
			return new ResponseEntity<> (RestaurantMapper.Instance.mapRestaurantToRestaurantDTO(fetchRestaurantById.get()),HttpStatus.OK);

		}
		else {
			RestaurantDTO dto = new RestaurantDTO();
			dto.setMessage("Please enter correct id");
			return new ResponseEntity<> (dto, HttpStatus.NOT_FOUND);
		}
	}

}
