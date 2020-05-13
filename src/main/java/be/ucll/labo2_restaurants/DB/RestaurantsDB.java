package be.ucll.labo2_restaurants.DB;

import be.ucll.labo2_restaurants.domain.Restaurant;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.ArrayList;

@Repository
public class RestaurantsDB implements Serializable {
    private ArrayList<Restaurant> restaurants;

    public RestaurantsDB(){
        this.restaurants = new ArrayList<>();
        this.addRestaurant("Alma 1", "Tiensestraat 115 – 3000 Leuven", 3.9);
        this.addRestaurant("Alma 2", "E. Van Evenstraat 2 – 3000 Leuven", 4.5);
        this.addRestaurant("Alma 3", "Steengroevenlaan 3 – 3001 Heverlee", 4.1);
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public void addRestaurant(Restaurant restaurant){
        this.restaurants.add(restaurant);
    }

    public void addRestaurant(String name, String address, double rating){
        Restaurant restaurant = new Restaurant(name, address, rating);
        this.restaurants.add(restaurant);
    }
}
