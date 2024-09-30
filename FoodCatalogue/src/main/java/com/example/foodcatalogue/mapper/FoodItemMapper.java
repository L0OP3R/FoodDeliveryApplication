package com.example.foodcatalogue.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.foodcatalogue.dto.FoodItemDTO;
import com.example.foodcatalogue.entity.FoodItem;

@Mapper
public interface FoodItemMapper {
	FoodItemMapper Instance = Mappers.getMapper(FoodItemMapper.class);
	
	
	FoodItem foodItemDtoToFoodItem(FoodItemDTO foodItemDTO);
	FoodItemDTO foodItemToFoodItemDto(FoodItem foodItem);
	

}
