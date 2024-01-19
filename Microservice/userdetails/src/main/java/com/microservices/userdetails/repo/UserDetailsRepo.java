package com.microservices.userdetails.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.userdetails.entity.UserDetails;

@Repository
public interface UserDetailsRepo extends JpaRepository<UserDetails, Integer> {

}
