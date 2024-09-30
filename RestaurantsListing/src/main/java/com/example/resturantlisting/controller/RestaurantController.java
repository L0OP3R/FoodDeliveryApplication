package com.example.resturantlisting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.resturantlisting.dto.RestaurantDTO;
import com.example.resturantlisting.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	@Autowired                    //inject dependency of restaurant service class
	RestaurantService restaurantService;
	
	@PostMapping("/addRestaurant")
	public ResponseEntity<RestaurantDTO> addRestaurant(@RequestBody RestaurantDTO restaurantDTO){
		RestaurantDTO savedRestaurant = restaurantService.addRestaurant(restaurantDTO);
		return new ResponseEntity<>(savedRestaurant, HttpStatus.CREATED);
	}
	@GetMapping("/fetchAllRestaurants")
	public ResponseEntity<List<RestaurantDTO>> fetchAllRestaurants(){
		List<RestaurantDTO> restaurantList = restaurantService.fetchAllRestaurants();
		return new ResponseEntity<> (restaurantList, HttpStatus.OK);
	}
	@GetMapping("/fetchRestaurantById/{id}")
	public ResponseEntity<RestaurantDTO> fetchRestaurantById(@PathVariable Integer id){
		 return restaurantService.fetchRestaurantById(id);
		//return new ResponseEntity<> (restaurantById, HttpStatus.OK);
	}

}
