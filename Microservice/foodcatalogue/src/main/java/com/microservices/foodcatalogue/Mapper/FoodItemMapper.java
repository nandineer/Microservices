package com.microservices.foodcatalogue.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.microservices.foodcatalogue.dto.FoodItemDTO;
import com.microservices.foodcatalogue.entity.FoodItem;

@Mapper
public interface FoodItemMapper {
	
	FoodItemMapper INSTANCE = Mappers.getMapper(FoodItemMapper.class);
	
	FoodItem convertFoodItemDTOToFoodItem(FoodItemDTO foodItemDTO);
	
	FoodItemDTO convertFoodItemToFoodItemDTO(FoodItem foodItem);

}
