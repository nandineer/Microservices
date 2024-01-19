package com.microservices.userdetails.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.microservices.userdetails.dto.UserDetailsDTO;
import com.microservices.userdetails.entity.UserDetails;

@Mapper
public interface UserDetailsMapper {
	
	
	UserDetailsMapper INSTANCE = Mappers.getMapper(UserDetailsMapper.class);
	
	UserDetails mapUserDetailsDTOToUserDetails(UserDetailsDTO  userDetailsDTO);
	
	UserDetailsDTO mapUserDetailsToUserDetailsDTO(UserDetails userDetails);
	

}
