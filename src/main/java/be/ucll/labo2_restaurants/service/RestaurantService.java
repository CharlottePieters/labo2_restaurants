package be.ucll.labo2_restaurants.service;

import be.ucll.labo2_restaurants.domain.Restaurant;

import java.util.ArrayList;

public interface RestaurantService {

    public ArrayList<Restaurant> getRestaurants();

    void addRestaurant(Restaurant restaurant);


}
