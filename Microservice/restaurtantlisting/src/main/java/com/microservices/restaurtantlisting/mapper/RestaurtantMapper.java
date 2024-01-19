package com.microservices.restaurtantlisting.mapper;



import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.microservices.restaurtantlisting.dto.RestaurtantDTO;
import com.microservices.restaurtantlisting.entity.Restaurant;

@Mapper
public interface RestaurtantMapper {

	RestaurtantMapper INSTANCE = Mappers.getMapper(RestaurtantMapper.class);
	
	 Restaurant mapRestaurtantDTOToRestaurtant(RestaurtantDTO restaurtantDTO);
	 
	 RestaurtantDTO mapRestaurtantToRestaurtantDTO(Restaurant r);
	 
}