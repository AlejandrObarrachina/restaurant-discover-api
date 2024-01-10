package com.restaurantapi.restaurantcrud.repository;

import com.restaurantapi.restaurantcrud.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
