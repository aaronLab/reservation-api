package com.example.reservation.interfaces;

import com.example.reservation.domain.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
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

}
