package com.microservices.foodcatalogue.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

import com.microservices.foodcatalogue.entity.FoodItem;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodCataloguePage {

    private List<FoodItem> foodItemsList;
    private RestaurtantDTO restaurantDto;
	public List<FoodItem> getFoodItemsList() {
		return foodItemsList;
	}
	public void setFoodItemsList(List<FoodItem> foodItemsList) {
		this.foodItemsList = foodItemsList;
	}
	public RestaurtantDTO getRestaurantDto() {
		return restaurantDto;
	}
	public void setRestaurantDto(RestaurtantDTO restaurantDto) {
		this.restaurantDto = restaurantDto;
	}
    
    
}