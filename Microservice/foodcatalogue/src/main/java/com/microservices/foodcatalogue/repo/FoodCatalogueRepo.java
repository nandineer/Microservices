package com.microservices.foodcatalogue.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.microservices.foodcatalogue.entity.FoodItem;

import java.util.List;

@Repository
public interface FoodCatalogueRepo extends JpaRepository<FoodItem, Integer> {
	
	List<FoodItem> findByRestaurantId(Integer restaurantId);

}