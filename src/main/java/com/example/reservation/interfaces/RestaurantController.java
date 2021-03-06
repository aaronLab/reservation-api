package com.example.reservation.interfaces;

import com.example.reservation.domain.Restaurant;
import com.example.reservation.domain.RestaurantRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    private final RestaurantRepository repository = new RestaurantRepository();

    @GetMapping("/restaurants")
    public List<Restaurant> list() {

        return repository.findAll();
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id) {

        return repository.findById(id);
    }

}
