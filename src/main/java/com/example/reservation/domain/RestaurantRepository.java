package com.example.reservation.domain;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepository {

    List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantRepository() {
        restaurants.add(new Restaurant(1000L, "Old Restaurant", "KR"));
        restaurants.add(new Restaurant(2000L, "New Restaurant", "KR"));
    }

    public List<Restaurant> findAll() {
        return restaurants;
    }

    public Restaurant findById(Long id) {
        List<Restaurant> restaurants = this.findAll();

        return restaurants.stream()
                .filter(restaurant -> restaurant.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}
