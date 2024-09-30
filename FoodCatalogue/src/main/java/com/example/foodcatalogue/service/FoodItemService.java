package com.example.foodcatalogue.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.foodcatalogue.dto.FoodCatalogue;
import com.example.foodcatalogue.dto.FoodItemDTO;
import com.example.foodcatalogue.dto.Restaurant;
import com.example.foodcatalogue.entity.FoodItem;
import com.example.foodcatalogue.mapper.FoodItemMapper;
import com.example.foodcatalogue.repository.FoodItemRepository;


@Service
public class FoodItemService { 
	@Autowired
	FoodItemRepository foodItemRepository;
	
	@Autowired(required = true)
	RestTemplate restTemplate; //whenever we need to call other API methods we need to use Rest Template

	public FoodItemDTO addFoodItem(FoodItemDTO foodItemDTO) {
		 FoodItem addFoodItem = foodItemRepository.save(FoodItemMapper.Instance.foodItemDtoToFoodItem(foodItemDTO));
		return FoodItemMapper.Instance.foodItemToFoodItemDto(addFoodItem);
	}

	public FoodCatalogue fetchRestaurantAndFoodItemById(Integer restaurantId) {
		// TODO Auto-generated method stub
		List<FoodItem> foodItembyId = fetchFoodItem(restaurantId);
		Restaurant restaurant = fetchRestaurantDtlsFromRestaurantMS(restaurantId);
		FoodCatalogue foodCatalogue = createFoodCatalogue(foodItembyId,restaurant);
		
		return foodCatalogue;
	}

	private List<FoodItem> fetchFoodItem(Integer restaurantId) {
		// TODO Auto-generated method stub
		return foodItemRepository.findByRestaurantId(restaurantId);
	}

	private FoodCatalogue createFoodCatalogue(List<FoodItem> foodItembyId, Restaurant restaurant) {
		// TODO Auto-generated method stub
		FoodCatalogue foodCatalogue = new FoodCatalogue();
		foodCatalogue.setFoodItems(foodItembyId);
		foodCatalogue.setRestaurant(restaurant);
		return foodCatalogue;
		
		
		
	}

	private Restaurant fetchRestaurantDtlsFromRestaurantMS(Integer restaurantId) {
		// TODO Auto-generated method stub      //below + is called string concatenation to pass the ID
		
		return restTemplate.getForObject("http://Restaurant-SERVICE/restaurant/fetchRestaurantById/"+restaurantId, Restaurant.class) ;
	}
	
	
	
	

}
