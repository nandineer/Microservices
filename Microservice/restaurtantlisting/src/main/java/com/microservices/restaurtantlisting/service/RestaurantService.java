package com.microservices.restaurtantlisting.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.restaurtantlisting.dto.RestaurtantDTO;
import com.microservices.restaurtantlisting.entity.Restaurant;
import com.microservices.restaurtantlisting.mapper.RestaurtantMapper;
import com.microservices.restaurtantlisting.repo.RestaurantRepo;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepo restaurantRepo;

	public List<RestaurtantDTO> findAllRestaurtants() {
		// TODO Auto-generated method stub
		
		List<Restaurant> restaurants = restaurantRepo.findAll();
		List<RestaurtantDTO> restaurtantDTOs =restaurants.stream().map(r-> RestaurtantMapper.INSTANCE.mapRestaurtantToRestaurtantDTO(r)).collect(Collectors.toList());
		return restaurtantDTOs;
	}
	
	
	
	public RestaurtantDTO findRestaurtantById(Integer id) {
		// TODO Auto-generated method stub
		
		Optional<Restaurant> restaurant = restaurantRepo.findById(id);
		RestaurtantDTO restaurtantDTO =RestaurtantMapper.INSTANCE.mapRestaurtantToRestaurtantDTO(restaurant.get());
		return restaurtantDTO;
	}
	
	
	public RestaurtantDTO addRestaurtant(RestaurtantDTO restaurtantDTO) {
		// TODO Auto-generated method stub
		
		Restaurant restaurant = RestaurtantMapper.INSTANCE.mapRestaurtantDTOToRestaurtant(restaurtantDTO);
		Restaurant savedRestaurant = restaurantRepo.save(restaurant);
		return RestaurtantMapper.INSTANCE.mapRestaurtantToRestaurtantDTO(savedRestaurant);
	}

}