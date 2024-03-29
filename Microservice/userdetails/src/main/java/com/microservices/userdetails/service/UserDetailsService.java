package com.microservices.userdetails.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.userdetails.dto.UserDetailsDTO;
import com.microservices.userdetails.entity.UserDetails;
import com.microservices.userdetails.mapper.UserDetailsMapper;
import com.microservices.userdetails.repo.UserDetailsRepo;

@Service
public class UserDetailsService {
	
	@Autowired
	private UserDetailsRepo userDetailsRepo;

	public UserDetailsDTO addUserDetails(UserDetailsDTO userDetailsDTO) {
		
		UserDetails userDetails = UserDetailsMapper.INSTANCE.mapUserDetailsDTOToUserDetails(userDetailsDTO);
		UserDetails savedUserDetails = userDetailsRepo.save(userDetails);
		return UserDetailsMapper.INSTANCE.mapUserDetailsToUserDetailsDTO(savedUserDetails);
		
	}

	public List<UserDetailsDTO> fetchUserDetails() {
		// TODO Auto-generated method stub
		
		List<UserDetails> userDetails=userDetailsRepo.findAll();
		List<UserDetailsDTO> userDetailsDTOs=userDetails.stream().map(u-> UserDetailsMapper.INSTANCE.mapUserDetailsToUserDetailsDTO(u)).collect(Collectors.toList());
		return userDetailsDTOs;
	}

}
