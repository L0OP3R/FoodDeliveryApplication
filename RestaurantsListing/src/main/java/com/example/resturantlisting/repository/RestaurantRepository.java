package com.example.resturantlisting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.resturantlisting.entity.Restaurant;

@Repository                 //Represents the class as repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer>{
	

}
