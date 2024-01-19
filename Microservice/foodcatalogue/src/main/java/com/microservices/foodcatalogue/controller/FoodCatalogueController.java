package com.microservices.foodcatalogue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.foodcatalogue.Mapper.FoodItemMapper;
import com.microservices.foodcatalogue.dto.FoodCataloguePage;
import com.microservices.foodcatalogue.dto.FoodItemDTO;
import com.microservices.foodcatalogue.entity.FoodItem;
import com.microservices.foodcatalogue.service.FoodCatalogueService;

@RestController
@RequestMapping("/foodCatalogue")
public class FoodCatalogueController {
	
	@Autowired
	private FoodCatalogueService foodCatalogueService;
	
	@PostMapping("/addFoodItem")
	public ResponseEntity<FoodItemDTO> addFoodItem(@RequestBody FoodItemDTO foodItemDTO){
		
		FoodItemDTO savedFoodItem =  foodCatalogueService.addFoodItem(foodItemDTO);
		return new ResponseEntity<>(savedFoodItem,HttpStatus.OK)		;
		
	}
	
	@GetMapping("/fetchRestaurtantAndFoodItemById/{restaurtantId}")
	public ResponseEntity<FoodCataloguePage> fetchRestaurtantDetailsFromFoodMenu(@PathVariable Integer restaurtantId){
		
		FoodCataloguePage foodCataloguePage= foodCatalogueService.fetchFoodCataloguePageDetails(restaurtantId);
		return new ResponseEntity<>(foodCataloguePage,HttpStatus.OK);
	}

}
