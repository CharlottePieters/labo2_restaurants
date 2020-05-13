package be.ucll.labo2_restaurants.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Restaurant implements Serializable {
    private String name;
    private String address;
    private double rating;

    public Restaurant(){}

    public Restaurant(String name, String address, double rating){
        this.setName(name);
        this.setAddress(address);
        this.setRating(rating);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (0<=rating && rating<=5){
            this.rating = rating;
        }
        else {
            throw new IllegalArgumentException("The rating of a restaurant has to be between 0 and 5.");
        }
    }
}
