package com.example.foodcatalogue.dto;

import java.util.List;

import com.example.foodcatalogue.entity.FoodItem;

public class FoodCatalogue {
	private Restaurant restaurant;
	private List<FoodItem> foodItems;
	
	
	public FoodCatalogue() {
		//
		// TODO Auto-generated constructor stub
		
	}

	public FoodCatalogue(Restaurant restaurant, List<FoodItem> foodItems) {
		super();
		this.restaurant = restaurant;
		this.foodItems = foodItems;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public List<FoodItem> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<FoodItem> foodItems) {
		this.foodItems = foodItems;
	}
	
}
