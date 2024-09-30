package com.example.order.dto;

import java.util.List;

public class OrderDTOFrontEnd {
	private List<FootItemDTO> foodItemList;
	private Integer userId;
	private Restaurant restaurant;
	
	public OrderDTOFrontEnd() {
		// TODO Auto-generated constructor stub
	}

	public OrderDTOFrontEnd(List<FootItemDTO> foodItemList, Integer userId, Restaurant restaurant) {
		super();
		this.foodItemList = foodItemList;
		this.userId = userId;
		this.restaurant = restaurant;
	}

	public List<FootItemDTO> getFoodItemList() {
		return foodItemList;
	}

	public void setFoodItemList(List<FootItemDTO> foodItemList) {
		this.foodItemList = foodItemList;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	

}
