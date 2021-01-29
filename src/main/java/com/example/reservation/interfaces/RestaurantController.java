package com.example.reservation.interfaces;

import com.example.reservation.domain.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> list() {
        List<Restaurant> restaurants = new ArrayList<>();

        Restaurant restaurant = new Restaurant(1000L, "New Restaurant", "KR");

        restaurants.add(restaurant);

        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id) {

        List<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant(1000L, "Old Restaurant", "KR"));
        restaurants.add(new Restaurant(2000L, "New Restaurant", "KR"));

        return restaurants.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}
