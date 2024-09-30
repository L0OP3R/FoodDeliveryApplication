package com.example.foodcatalogue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.foodcatalogue.dto.FoodCatalogue;
import com.example.foodcatalogue.dto.FoodItemDTO;
import com.example.foodcatalogue.service.FoodItemService;

@RestController

@RequestMapping("/foodcatalogue")
public class FoodController {
	@Autowired
	FoodItemService foodItemService;
	
	@PostMapping("/addFoodItem")
	public ResponseEntity<FoodItemDTO> addFoodItem(@RequestBody FoodItemDTO foodItemDTO) {
		//TODO: process POST request
		FoodItemDTO dto = foodItemService.addFoodItem(foodItemDTO);
		return new ResponseEntity<> (dto, HttpStatus.CREATED);
	}
	@GetMapping("/fetchRestaurantAndFoodItemById/{restaurantId}")
	public ResponseEntity<FoodCatalogue> fetchRestaurantAndFoodItemById(@PathVariable Integer restaurantId){
		FoodCatalogue getFoodById =foodItemService.fetchRestaurantAndFoodItemById(restaurantId);
		return new ResponseEntity<> (getFoodById, HttpStatus.OK);
	}
	
	

}
