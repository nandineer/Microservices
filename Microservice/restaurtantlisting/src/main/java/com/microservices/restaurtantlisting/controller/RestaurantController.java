package com.microservices.restaurtantlisting.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.restaurtantlisting.dto.RestaurtantDTO;
import com.microservices.restaurtantlisting.service.RestaurantService;

@RestController
@RequestMapping("/restaurtant") 
public class RestaurantController {
	
	@Autowired
	RestaurantService restaurantService;
	
	@GetMapping("/fetchAllRestaurtants")
	public ResponseEntity<List<RestaurtantDTO>> fetchAllRestaurtants(){
		
		List<RestaurtantDTO> restaurtants =restaurantService.findAllRestaurtants();
		return new ResponseEntity<>(restaurtants,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/fetchRestaurtantById/{id}")
	public ResponseEntity<RestaurtantDTO> fetchRestaurtantById(@PathVariable Integer id){
		
		RestaurtantDTO restaurtant =restaurantService.findRestaurtantById(id);
		return new ResponseEntity<>(restaurtant,HttpStatus.OK);
	}
	
	@PostMapping("/addRestaurtant")
	public ResponseEntity<RestaurtantDTO> addRestaurtant(@RequestBody RestaurtantDTO restaurtantDTO){
		
		RestaurtantDTO restaurtant =restaurantService.addRestaurtant(restaurtantDTO);
		return new ResponseEntity<>(restaurtant,HttpStatus.OK);
	}
}
