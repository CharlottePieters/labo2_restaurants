package be.ucll.labo2_restaurants.controller;

import be.ucll.labo2_restaurants.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;

@Controller
public class RestaurantController implements Serializable {
    private RestaurantService restaurantService;

    public RestaurantController(){}

    @Autowired
    public RestaurantController(RestaurantService restaurantService){
        this.setRestaurantService(restaurantService);
    }

    public RestaurantService getRestaurantService() {
        return restaurantService;
    }

    public void setRestaurantService(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @RequestMapping("/")
    public String getRestaurants(Model model){
        model.addAttribute("restaurants", this.restaurantService.getRestaurants());
        return "index";
    }



}
