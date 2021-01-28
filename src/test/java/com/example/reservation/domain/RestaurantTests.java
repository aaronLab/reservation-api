package com.example.reservation.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RestaurantTests {

    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant(1000L, "New Restaurant", "KR");
        assertThat(restaurant.getId(), is(1000L));
        assertThat(restaurant.getName(), is("New Restaurant"));
        assertThat(restaurant.getAddress(), is("KR"));
    }

    @Test
    public void information() {
        Restaurant restaurant = new Restaurant(1000L, "New Restaurant", "KR");

        assertThat(restaurant.getInformation(), is("New Restaurant in KR"));
    }

}