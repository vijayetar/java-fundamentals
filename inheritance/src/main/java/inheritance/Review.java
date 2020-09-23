package inheritance;

import java.util.ArrayList;
import java.util.HashMap;

public class Review {
    private String body;
    private String author;
    private int stars1;
    public static ArrayList<Restaurant> allRestaurants= new ArrayList<>();
    public static ArrayList<Shop> allShops = new ArrayList<>();
    public static HashMap<Shop, ArrayList<Review>> shopAndReviews = new HashMap<>();
    private static ArrayList<Review> reviews = new ArrayList<>();
    public static HashMap<Restaurant, ArrayList<Review>> restaurantAndReviews = new HashMap<>();


    public Review(String body, String author, int stars1) {
        this.body = body;
        this.author = author;
        this.stars1 = stars1;
    }

    public String toString(){
        return String.format("Review: %s, Author: %s,  Stars: %d", body, author, stars1);

    }
    /// Show all the restaurants
    public static String showRestaurantList(){
        String outputString = " Restaurants reviewed so far: \n";
        for (Restaurant place: allRestaurants) {
            outputString+= " "+place + " ,\n";
        }
        return outputString;
    }
    public int getReviewStars(){
        return this.stars1;
    }

    // show each restaurant and the reviews in a hashmap
    public static String showEachRestaurantReview(){
        String outputString = "";
        for (Restaurant r: restaurantAndReviews.keySet()){
            outputString += String.format("\nRestaurant Details: %s \n", r);
            int count = 0;
            for (Review rw: restaurantAndReviews.get(r)){
                count ++;
                outputString += count + ".  "+ rw+"\n";
            }
        }
        return outputString;
    }
    public static String showShopList(){
        String outputString = " Shops reviewed so far: \n";
        for (Shop place: allShops) {
            outputString+= " "+place + " ,\n";
        }
        return outputString;
    }
    public static String showEachShopReview(){
        String outputString = "";
        for (Shop r: shopAndReviews.keySet()){
            outputString += String.format("\nShop Details: %s \n", r);
            int count = 0;
            for (Review rw: shopAndReviews.get(r)){
                count ++;
                outputString += count + ".  "+ rw+"\n";
            }
        }
        return outputString;
    }
}
